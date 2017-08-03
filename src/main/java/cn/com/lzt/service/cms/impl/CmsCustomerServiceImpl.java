package cn.com.lzt.service.cms.impl;/**
 * Created by Administrator on 2017/8/3.
 */

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.mapper.TCmsCustomerAddressMapper;
import cn.com.lzt.mapper.TCmsCustomerMapper;
import cn.com.lzt.model.TCmsCustomerAddress;
import cn.com.lzt.model.dto.CmsCustomerReq;
import cn.com.lzt.service.cms.CmsCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 客户service
 *
 * @author WangH
 * @create 2017-08-03 15:00
 **/
@Service
@Transactional
public class CmsCustomerServiceImpl implements CmsCustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CmsCustomerServiceImpl.class);
    
    @Autowired
    private TCmsCustomerAddressMapper tCmsCustomerAddressMapper;
    @Autowired
    private TCmsCustomerMapper tCmsCustomerMapper;
    
    /**
     * 增加收获地址
     *
     * @param tCmsCustomerAddress
     * @return
     */
    @Override
    public ResponseMessage addCustomerAddress(TCmsCustomerAddress tCmsCustomerAddress) {
        tCmsCustomerAddressMapper.insertSelective(tCmsCustomerAddress);
        return ResponseMessage.createSuccessMsg(0);
    }

    /**
     * 修改收获地址
     *
     * @param tCmsCustomerAddress
     * @return
     */
    @Override
    public ResponseMessage updateCustomerAddress(TCmsCustomerAddress tCmsCustomerAddress) {
        tCmsCustomerAddressMapper.updateByPrimaryKeySelective(tCmsCustomerAddress);
        return ResponseMessage.createSuccessMsg(0);
    }

    /**
     * 登录接口
     *
     * @param tCmsCustomerAddress
     * @return
     */
    @Override
    public ResponseMessage login(CmsCustomerReq tCmsCustomerAddress) {
        return null;
    }

    /**
     * 注册接口
     *
     * @param tCmsCustomerAddress
     * @return
     */
    @Override
    public ResponseMessage register(CmsCustomerReq tCmsCustomerAddress) {
        return null;
    }
}
