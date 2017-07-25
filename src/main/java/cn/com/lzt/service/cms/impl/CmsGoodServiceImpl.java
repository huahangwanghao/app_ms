package cn.com.lzt.service.cms.impl;/**
 * Created by Administrator on 2017/7/20.
 */

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.mapper.TCmsGoodMapper;
import cn.com.lzt.model.TCmsGood;
import cn.com.lzt.model.TCmsGoodCriteria;
import cn.com.lzt.model.dto.CmsGoodReq;
import cn.com.lzt.service.cms.CmsGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * cms商品service
 *
 * @author WangH
 * @create 2017-07-20 17:55
 **/
@Service
@Transactional
public class CmsGoodServiceImpl implements CmsGoodService {
    @Autowired
    private TCmsGoodMapper tCmsGoodMapper;


    @Override
    public ResponseMessage save(TCmsGood tCmsGood) {
        ResponseMessage rm=ResponseMessage.createSuccessMsg(0);
        //设置过期时间是2099年
        tCmsGood.setGoodEndTime(new Date(2114355661000l));
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
        TCmsGoodCriteria tCmsGoodCriteria=new TCmsGoodCriteria();
        TCmsGoodCriteria.Criteria criteria=tCmsGoodCriteria.createCriteria();
        
        if(null!=cmsGoodReq.getGoodId())
        criteria.andGoodIdEqualTo(cmsGoodReq.getGoodId());
        //3类产品
        criteria.andGoodLevelEqualTo("3");
        //有效的记录
        criteria.andDataFlagEqualTo("1");
        List<TCmsGood> list=tCmsGoodMapper.selectByExample(tCmsGoodCriteria);
        return ResponseMessage.createSuccessMsg(list);
    }

    /**
     * 修改商品信息
     *
     * @param tCmsGood
     * @return
     */
    @Override
    public ResponseMessage update(TCmsGood tCmsGood) {
        ResponseMessage rm=ResponseMessage.createSuccessMsg(0);
        tCmsGoodMapper.updateByPrimaryKeySelective(tCmsGood);
        return rm;
    }

    /**
     * 批量删除
     *
     * @param goodIds
     * @return
     */
    @Override
    public ResponseMessage batchDeleteByIds(String goodIds) {


        String _goodIds=goodIds.substring(0,goodIds.length()-1);
        String[] a=_goodIds.split(",");
        List<String> list=new ArrayList<String>();
        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }
        int i=tCmsGoodMapper.batchDeleteByIds(list);
        
        return ResponseMessage.createSuccessMsg(0);
    }


}
