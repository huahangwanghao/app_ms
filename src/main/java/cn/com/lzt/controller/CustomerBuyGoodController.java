package cn.com.lzt.controller;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsShoppingCar;
import cn.com.lzt.service.cms.CustomerBuyService;
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
		responseMessage=customerBuyService.addBuyCar(tCmsShoppingCar);
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
		responseMessage=customerBuyService.updateBuyCar(tCmsShoppingCar);
		return responseMessage;
	}

	
	

}
