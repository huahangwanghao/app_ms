package cn.com.lzt.controller;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsCustomerAddress;
import cn.com.lzt.service.cms.CmsCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 客户control
 */
@RestController
@RequestMapping("/customer")
public class CmsCustomerController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(CmsCustomerController.class);
	@Autowired
	private CmsCustomerService cmsCustomerService;


	/**
	 * 增加收获地址
	 *
	 * @param tCmsCustomerAddress
	 * @return
	 */
	@RequestMapping("/toAddCustomerAddress.do")
	public ResponseMessage addCustomerAddress(@ModelAttribute("tCmsCustomerAddress") TCmsCustomerAddress tCmsCustomerAddress) {
		logger.info("增加收获地址入参:"+tCmsCustomerAddress);
		ResponseMessage responseMessage=null;
		responseMessage=cmsCustomerService.addCustomerAddress(tCmsCustomerAddress);
		return responseMessage;
	}

	/**
	 * 修改收获地址
	 *
	 * @param tCmsCustomerAddress
	 * @return
	 */
	@RequestMapping("/toUpdateCustomerAddress.do")
	public ResponseMessage updateCustomerAddress(@ModelAttribute("tCmsCustomerAddress") TCmsCustomerAddress tCmsCustomerAddress) {
		logger.info("修改收获地址入参:"+tCmsCustomerAddress);
		ResponseMessage responseMessage=null;
		responseMessage=cmsCustomerService.updateCustomerAddress(tCmsCustomerAddress);
		return responseMessage;
	}

	
	

}
