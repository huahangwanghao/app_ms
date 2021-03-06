package com.haohai.cms.controller;

import com.haohai.cms.model.BaseMap;
import com.haohai.cms.model.TRole;
import com.haohai.cms.model.TSysmenu;
import com.haohai.cms.model.TSysuser;
import com.haohai.cms.service.role.IRoleService;
import com.haohai.cms.service.sys.IMenuService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController {

	@Autowired
	private IMenuService menuService;

	@Autowired
	private IRoleService roleService;

	/**
	 * 首页查询
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("index")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		// if (request.getSession().getAttribute("menumap") != null
		// && request.getSession().getAttribute("menus") != null) {
		// mav.addObject("menus", request.getSession().getAttribute("menus"));
		// } else {
		TSysuser user = this.getSessionUserWeb(request);
		Map<String, Object> menumap = this.menuService.findMenus(user.getId(),null, 0);
		request.getSession().setAttribute("menumap",JSON.toJSON(menumap.get("menumap")));
		request.getSession().setAttribute("menus", menumap.get("menus"));
		mav.addObject("menus", menumap.get("menus"));
		// }
		mav.setViewName("index");
		return mav;
	}

	/**
	 * 菜单管理
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("findMenus")
	public ModelAndView findMenus(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		TSysuser user = this.getSessionUserWeb(request);
		Map<String, Object> menumap = this.menuService.findMenus(user.getId(), null, 1);
		List<Map<String, Object>> menuimgs = this.menuService.findMenuImgs();
		mav.addObject("menuimgs", menuimgs);
		String ztreedata = JSONObject.toJSONString(menumap.get("menus"));
		mav.addObject("ztreedata", ztreedata);
		mav.setViewName("sys/menu");
		return mav;
	}

	/**
	 * 新增菜单
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping("addMenu")
	@ResponseBody
	public Object addMenu(TSysmenu menu) {
		Map<String, Object> map = BaseMap.getMap(ADD_SUCCESS);
		menu.setId(null);
		this.menuService.saveSysMenu(menu);
		return map;
	}

	/**
	 * 修改菜单
	 * 
	 * @param menu
	 * @return
	 */
	@RequestMapping("updateMenu")
	@ResponseBody
	public Object updateMenu(TSysmenu menu) {
		Map<String, Object> map = BaseMap.getMap(UPDATE_SUCCESS);
		this.menuService.saveSysMenu(menu);
		return map;
	}

	/**
	 * 删除菜单
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping("deleteMenu")
	@ResponseBody
	public Object deleteMenu(Integer menuid) {
		Map<String, Object> map = BaseMap.getMap(DELETE_SUCCESS);
		this.menuService.deleteMenu(menuid);
		return map;
	}

	/**
	 * 角色权限页面
	 * @return
	 */
	@RequestMapping("roleright")
	public ModelAndView findRoleright(HttpServletRequest request,Integer roleid) {
		ModelAndView mav = new ModelAndView();
		// 查询角色列表
		List<TRole> roles = this.roleService.findRoles();
		mav.addObject("roles", roles);
		TSysuser user = this.getSessionUserWeb(request);
		Map<String, Object> menumap = this.menuService.findMenus(user.getId(),roleid, 2);
		String ztreedata = JSONObject.toJSONString(menumap.get("menus"));
		mav.addObject("ztreedata", ztreedata);
		mav.addObject("roleid", roleid);
		mav.setViewName("sys/roleright");
		return mav;
	}

	/**
	 * 保存角色权限
	 * 
	 * @param menuids
	 * @param roleid
	 * @return
	 */
	@RequestMapping("saveRoleright")
	@ResponseBody
	public Object saveRoleright(String[] menuids, Integer roleid, HttpServletRequest request) {
		Map<String, Object> map = BaseMap.getMap(SAVE_SUCCESS);
		TSysuser user = this.getSessionUserWeb(request);
		this.menuService.saveRoleright(menuids, roleid, user.getId());
		return map;
	}

}
