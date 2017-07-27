package cn.com.lzt.service.cms.impl;/**
 * Created by Administrator on 2017/7/20.
 */

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.mapper.TCmsGoodMapper;
import cn.com.lzt.model.TCmsGood;
import cn.com.lzt.model.TCmsGoodCriteria;
import cn.com.lzt.model.dto.CmsGoodReq;
import cn.com.lzt.model.dto.PageInfoReq;
import cn.com.lzt.service.cms.CmsGoodService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(CmsGoodServiceImpl.class);
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

    /**
     * 分页信息查询
     *
     * @param pageInfo
     * @return
     */
    @Override
    public JSONObject query4Page(PageInfoReq pageInfo) {
        logger.info("分页查询商品信息入参:"+pageInfo);
        JSONObject json=JSONObject.parseObject(pageInfo.getQueryJson());
        String goodName=json.getString("goodName");
        String userName=json.getString("userName");
        TCmsGoodCriteria tCmsGoodCriteria=new TCmsGoodCriteria();
        TCmsGoodCriteria.Criteria criteria=tCmsGoodCriteria.createCriteria();
        //3类产品
        // criteria.andGoodLevelEqualTo("3");
        if(StringUtils.isNotEmpty(goodName))
        criteria.andGoodNameLike(goodName);
        //有效的记录
        criteria.andDataFlagEqualTo("1");
        PageHelper.startPage(pageInfo.getPageNumber(),pageInfo.getPageSize());
        List<TCmsGood> list=tCmsGoodMapper.selectByExample(tCmsGoodCriteria);
        PageInfo<TCmsGood>  pageInfo1=new PageInfo<TCmsGood>(list);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("total",pageInfo1.getTotal());
        JSONArray jsonArray=new JSONArray();
        jsonArray.addAll(list);
        jsonObject.put("rows",jsonArray);
        logger.info("返回前端的信息:"+jsonObject);
        return jsonObject;
    }


}
