package com.haohai.cms.controller.api;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.controller.BaseController;
import com.haohai.cms.model.TCmsGoodComment;
import com.haohai.cms.model.dto.CmsGoodCommentReq;
import com.haohai.cms.service.cms.CmsGoodCommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 评论control
 */
@RestController
@RequestMapping("/api/comment")
public class ApiGoodCommentController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(ApiGoodCommentController.class);
	@Autowired
	private CmsGoodCommentService cmsGoodCommentService;


	/**
	 * 修改cms评论
	 *
	 * @param tCmsGoodComment
	 * @return
	 */
	@RequestMapping("/toUpdateCmsGoodComment.do")
	public ResponseMessage updateCmsGoodComment(@ModelAttribute("tCmsGoodComment") TCmsGoodComment tCmsGoodComment) {
		logger.info("修改cms评论入参:"+tCmsGoodComment);
		ResponseMessage responseMessage=null;
		responseMessage=cmsGoodCommentService.update(tCmsGoodComment);
		return responseMessage;
	}

	/**
	 * 删除cms评论
	 *
	 * @param tCmsGoodComment
	 * @return
	 */
	@RequestMapping("/doDeleteCmsGoodComment.do")
	public ResponseMessage deleteCmsGoodComment(@ModelAttribute("tCmsGoodComment") TCmsGoodComment tCmsGoodComment) {
		logger.info("新增cms商品的入参:"+tCmsGoodComment);
		ResponseMessage responseMessage=null;
		tCmsGoodComment.setDataFlag("0");
		responseMessage=cmsGoodCommentService.update(tCmsGoodComment);
		return responseMessage;
	}
	/**
	 * 删除选中cms评论
	 *
	 * @param goodIds
	 * @return
	 */
	@RequestMapping("/doDeleteAllCmsGoodComment.do")
	public ResponseMessage deleteAllCmsGoodComment(@RequestParam String goodIds) {
		logger.info("新增cms商品的入参:"+goodIds);
		ResponseMessage responseMessage=null;
		responseMessage=responseMessage=cmsGoodCommentService.batchDeleteByIds(goodIds);
		return responseMessage;
	}

	
	/**
	 * 查询cms评论通过商品Id
	 *
	 * @param cmsGoodReq
	 * @return
	 */
	@RequestMapping("/getCmsGoodCommentById.do")
	public ResponseMessage getGoodCommentById(@ModelAttribute("cmsGoodReq") CmsGoodCommentReq cmsGoodReq) {
		logger.info("查询cms商品的入参:"+cmsGoodReq);
		ResponseMessage responseMessage=null;
		responseMessage=cmsGoodCommentService.getGoodCommentById(cmsGoodReq);
		logger.info("返回给前端的数据"+responseMessage);
		return responseMessage;
	}

	/**
	 * 查询cms评论信息
	 *
	 * @param 
	 * @return
	 */
	@RequestMapping("/getGoodCommentPageInfo.do")
	public ResponseMessage getGoodCommentPageInfo(@ModelAttribute("pageInfo") CmsGoodCommentReq pageInfo) {
		logger.info("查询cms分页信息入参:"+pageInfo);
		ResponseMessage json= cmsGoodCommentService.queryGoodComment4Page(pageInfo);
		logger.info("查询cms分页信息返回结果:"+json);
		return json;
		
	}

	/**
	 * 通过商品名称进行模糊查询
	 *
	 * @param
	 * @return
	 */
	@RequestMapping("/getGoodPageInfoByName.do")
	public ResponseMessage getGoodPageInfoByName(@ModelAttribute("pageInfo") CmsGoodCommentReq pageInfo) {
		logger.info("通过商品名称查询cms分页信息入参:"+pageInfo);
		ResponseMessage json= cmsGoodCommentService.queryGoodComment4Page(pageInfo);
		logger.info("通过商品名称查询cms分页信息返回结果:"+json);
		return json;

	}
	
	

}
