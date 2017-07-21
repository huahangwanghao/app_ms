package cn.com.lzt.service.cms.impl;/**
 * Created by Administrator on 2017/7/20.
 */

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.mapper.TCmsGoodMapper;
import cn.com.lzt.model.TCmsGood;
import cn.com.lzt.model.dto.CmsGoodReq;
import cn.com.lzt.service.cms.CmsGoodService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * cms商品service
 *
 * @author WangH
 * @create 2017-07-20 17:55
 **/
@Service
@Transactional
public class CmsGoodServiceImpl implements CmsGoodService {
    
    private TCmsGoodMapper tCmsGoodMapper;


    @Override
    public ResponseMessage save(TCmsGood tCmsGood) {
        ResponseMessage rm=ResponseMessage.createSuccessMsg(0);
         tCmsGoodMapper.insertSelective(tCmsGood);
        return rm;
    }

    /**
     * 通过条件查询商品信息
     *
     * @param cmsGoodReq
     * @return
     */
    @Override
    public ResponseMessage queryByCondition(CmsGoodReq cmsGoodReq) {
        return null;
    }
}