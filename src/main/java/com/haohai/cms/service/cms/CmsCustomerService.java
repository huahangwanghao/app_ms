package com.haohai.cms.service.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsCustomerAddress;
import com.haohai.cms.model.dto.CmsCustomerReq;

/**
 * Created by Administrator on 2017/7/20.
 */
public interface CmsCustomerService {
    /**
     * 增加收获地址
     * @return
     */
    ResponseMessage addCustomerAddress(TCmsCustomerAddress tCmsCustomerAddress);

    /**
     * 修改收获地址
     * @param tCmsCustomerAddress
     * @return
     */
    ResponseMessage updateCustomerAddress(TCmsCustomerAddress tCmsCustomerAddress);

    /**
     * 登录接口
     * @param tCmsCustomerAddress
     * @return
     */
    ResponseMessage login(CmsCustomerReq tCmsCustomerAddress);

    /**
     * 注册接口
     * @param tCmsCustomerAddress
     * @return
     */
    ResponseMessage register(CmsCustomerReq tCmsCustomerAddress);
    
}
