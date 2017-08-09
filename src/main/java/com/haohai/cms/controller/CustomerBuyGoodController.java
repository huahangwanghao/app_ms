package com.haohai.cms.controller;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsShoppingCar;
import com.haohai.cms.model.dto.CustomerBuyReq;
import com.haohai.cms.model.dto.PageDto;
import com.haohai.cms.service.cms.CustomerBuyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户购买商品
 */
@RestController
@RequestMapping("/buy")
public class CustomerBuyGoodController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerBuyGoodController.class);
	@Autowired
	private CustomerBuyService customerBuyService;


	/**
	 * 添加到购物车
	 *
	 * @param tCmsShoppingCar
	 * @return
	 */
	@RequestMapping("/toAddShoppingCar.do")
	public ResponseMessage addShoppingCar(@ModelAttribute("tCmsShoppingCar") TCmsShoppingCar tCmsShoppingCar) {
		logger.info("添加到购物车入参:"+ tCmsShoppingCar);
		ResponseMessage responseMessage=null;
		responseMessage=customerBuyService.addShoppingCar(tCmsShoppingCar);
		return responseMessage;
	}

	/**
	 * 修改购物车
	 *
	 * @param tCmsShoppingCar
	 * @return
	 */
	@RequestMapping("/toUpdateShoppingCar.do")
	public ResponseMessage updateShoppingCar(@ModelAttribute("tCmsShoppingCar") TCmsShoppingCar tCmsShoppingCar) {
		logger.info("修改购物车入参:"+tCmsShoppingCar);
		ResponseMessage responseMessage=null;
		responseMessage=customerBuyService.updateShoppingCar(tCmsShoppingCar);
		return responseMessage;
	}

	/**
	 * 获取购物车列表
	 *
	 * @param customerBuyReq
	 * @return
	 */
	@RequestMapping("/getShoppingCarList.do")
	public ResponseMessage getShoppingCarList(@ModelAttribute("customerBuyReq") CustomerBuyReq customerBuyReq) {
		logger.info("修改购物车入参:"+customerBuyReq);
		ResponseMessage responseMessage=null;
		responseMessage=customerBuyService.getShoppingCarList(customerBuyReq);
		return responseMessage;
	}
	/**
	 * 获取购物车详情
	 *
	 * @param
	 * @return
	 */
	@RequestMapping("/getShoppingCarDetail.do")
	public ResponseMessage getShoppingCarDetail(@ModelAttribute("customerBuyReq") CustomerBuyReq customerBuyReq) {
		logger.info("修改购物车入参:"+customerBuyReq);
		ResponseMessage responseMessage=null;
		responseMessage=customerBuyService.getShoppingCarDetailById(customerBuyReq.getCarId());
		return responseMessage;
	}

	/**
	 * 获取订单列表
	 *
	 * @param
	 * @return
	 */
	@RequestMapping("/getOrderList.do")
	public ResponseMessage getOrderList(@ModelAttribute("customerBuyReq") CustomerBuyReq customerBuyReq) {
		logger.info("获取订单列表入参:"+customerBuyReq);
		ResponseMessage responseMessage=null;
		responseMessage=customerBuyService.getOrderList(customerBuyReq);
		logger.info("查询订单列表返回数据:"+responseMessage);
		return responseMessage;
	}

	/**
	 * 管理后台过去订单列表
	 *
	 * @param
	 * @return
	 */
	@RequestMapping("/getOrderList4Cms.do")
	public ResponseMessage getOrderList4Cms(@ModelAttribute("pageDto") PageDto pageDto) {
		logger.info("修改购物车入参:"+ pageDto);
		ResponseMessage responseMessage=null;
		responseMessage=customerBuyService.getOrderList4Cms(pageDto);
		return responseMessage;
	}

	/**
	 * 获取订单列表
	 *
	 * @param
	 * @return
	 */
	@RequestMapping("/getOrderListDetail.do")
	public ResponseMessage getOrderListDetail(@ModelAttribute("customerBuyReq") CustomerBuyReq customerBuyReq) {
		logger.info("修改购物车入参:"+customerBuyReq);
		ResponseMessage responseMessage=null;
		responseMessage=customerBuyService.getOrderDetail(customerBuyReq);
		return responseMessage;
	}
	
	
	
	
	

}
