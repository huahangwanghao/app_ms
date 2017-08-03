package cn.com.lzt.service.cms;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsCustomerAddress;

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
}
