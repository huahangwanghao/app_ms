package com.haohai.cms.controller.api;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.controller.BaseController;
import com.haohai.cms.model.TCmsGood;
import com.haohai.cms.model.dto.PageDto;
import com.haohai.cms.service.cms.CmsGoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/good")
public class ApiGoodController extends BaseController {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiGoodController.class);
	
	@Autowired
	private CmsGoodService cmsGoodService;
	
	/**
	 * 查询商品列表
	 * @param 
	 * @return
	 */
	@RequestMapping("/getGoods.do")
	public ResponseMessage getGoods(@ModelAttribute("pageInfo") PageDto pageDto) {
		logger.info("查询商品列表请求参数："+pageDto);
		ResponseMessage responseMessage = null;//cmsGoodService.getGoods(pageDto);
		logger.info("查询商品列表响应结果：");
		return responseMessage;
	}

	/**
	 * 删除商品
	 * @param 
	 * @return
	 */
	@RequestMapping("/deleteCmsGood.do")
	public ResponseMessage deleteCmsGood(@ModelAttribute("tCmsGood") TCmsGood cmsGood) {
		logger.info("删除商品请求："+cmsGood);
		cmsGood.setDataFlag("0");
		ResponseMessage responseMessage = null;//cmsGoodService.updateCmsGood(cmsGood);
		return responseMessage;
	}
	
	/**
	 * 批量删除商品
	 * @param goodIds
	 * @return
	 */
	@RequestMapping("/batchdeleteCmsGood.do")
	public ResponseMessage batchdeleteCmsGood(@RequestParam String goodIds) {
		logger.info("批量删除商品请求："+goodIds);
		ResponseMessage responseMessage = cmsGoodService.tmBatchDeleteByIds(goodIds);
		return responseMessage;
	}
	
	/**
	 * 根据商品id查询商品信息
	 * @param 
	 * @return
	 */
	@RequestMapping("/getCmsGoodById.do")
	public ResponseMessage getCmsGoodById(@RequestParam Integer goodId) {
		logger.info("查询商品信息请求参数："+goodId);
		ResponseMessage responseMessage = cmsGoodService.getCmsGoodById(goodId);
		logger.info("查询商品信息响应结果："+responseMessage);
		return responseMessage;
	}

	/**
	 * 修改商品
	 * @param tCmsGood
	 * @return
	 */
	@RequestMapping("/toUpdateCmsGood.do")
	public ResponseMessage updateCmsGood(@ModelAttribute("tCmsGood") TCmsGood tCmsGood) {
		logger.info("新增cms商品的入参:"+tCmsGood);
		ResponseMessage responseMessage=null;
//		responseMessage=cmsGoodService.updateCmsGood(tCmsGood);
		return responseMessage;
	}

}
