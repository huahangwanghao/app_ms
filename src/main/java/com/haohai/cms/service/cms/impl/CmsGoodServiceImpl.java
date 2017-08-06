package com.haohai.cms.service.cms.impl;/**
 * Created by Administrator on 2017/7/20.
 */

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.util.StringUtil;
import com.haohai.cms.mapper.TCmsGoodMapper;
import com.haohai.cms.mapper.TCmsGoodReadMapper;
import com.haohai.cms.model.TCmsGood;
import com.haohai.cms.model.TCmsGoodCriteria;
import com.haohai.cms.model.TCmsGoodRead;
import com.haohai.cms.model.dto.CmsGoodDto;
import com.haohai.cms.service.cms.CmsGoodService;
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
    @Autowired
    private TCmsGoodReadMapper tCmsGoodReadMapper;
    
    /**
     * 查询商品列表
     * @param goodDto
     * @return
     */
    @Override
    public JSONObject getGoods(CmsGoodDto goodDto) {
    	JSONObject paramJson = JSONObject.parseObject(goodDto.getParamJson());
        TCmsGoodCriteria goodCriteria = new TCmsGoodCriteria();
        TCmsGoodCriteria.Criteria criteria = goodCriteria.createCriteria();
        criteria.andDataFlagEqualTo("1");//未删除记录
        if (StringUtils.isNotEmpty(paramJson.getString("goodName")))
        	criteria.andGoodNameLike("%" + paramJson.getString("goodName").trim() + "%");
        if (StringUtils.isNotEmpty(paramJson.getString("good_startdate")))
        	criteria.andCrtDateGreaterThanOrEqualTo(StringUtil.stringToDate(paramJson.getString("good_startdate"), "yyyy-MM-dd"));
        if (StringUtils.isNotEmpty(paramJson.getString("good_enddate")))
        	criteria.andCrtDateLessThanOrEqualTo(StringUtil.stringToDate(paramJson.getString("good_enddate"), "yyyy-MM-dd"));
        if (StringUtils.isNotEmpty(paramJson.getString("goodStatus")))
        	criteria.andGoodStatusEqualTo(paramJson.getString("goodStatus"));
        if (StringUtils.isNotEmpty(paramJson.getString("goodSpeci")))
        	criteria.andGoodSpeciEqualTo(paramJson.getString("goodSpeci"));
        goodCriteria.setOrderByClause(goodDto.getSortName() + " " + goodDto.getSortOrder());
        PageHelper.startPage(goodDto.getPageNumber(), goodDto.getPageSize());
        List<TCmsGood> goods = this.tCmsGoodMapper.selectByExample(goodCriteria);
        PageInfo<TCmsGood> pageInfo = new PageInfo<TCmsGood>(goods);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("total",pageInfo.getTotal());
        jsonObject.put("rows",goods);
        return jsonObject;
    }

    /**
     * 新增商品
     */
    @Override
    public ResponseMessage addCmsGood(TCmsGood cmsGood) {
    	ResponseMessage rm = ResponseMessage.createSuccessMsg(0);
        cmsGood.setGoodEndTime(StringUtil.getMaxDate());
        cmsGood.setGoodStatus("1");
        cmsGood.setDataFlag("1");
        cmsGood.setCrtDate(new Date());
        this.tCmsGoodMapper.insertSelective(cmsGood);
        logger.info("新增商品》商品id：" + cmsGood.getGoodId());
        return rm;
    }

    /**
     * 通过条件查询商品信息
     *
     * @param cmsGoodReq
     * @return
     */
    @Override
    public ResponseMessage queryByCondition(CmsGoodDto cmsGoodReq) {
        logger.info("查询商品详情页面入参:"+cmsGoodReq);
        TCmsGoodCriteria tCmsGoodCriteria=new TCmsGoodCriteria();
        TCmsGoodCriteria.Criteria criteria=tCmsGoodCriteria.createCriteria();
        
//        if(null!=cmsGoodReq.getGoodId())
//        criteria.andGoodIdEqualTo(cmsGoodReq.getGoodId());
//        //3类产品
////        criteria.andGoodLevelEqualTo("3");
//        //有效的记录
////        criteria.andDataFlagEqualTo("1");
//        
//        
//        //添加浏览记录
//        if(cmsGoodReq.getCustomerId()!=null){
//            TCmsGoodRead tCmsGoodRead=new TCmsGoodRead();
//            tCmsGoodRead.setCrtDate(new Date());
//            tCmsGoodRead.setCmsGoodId(cmsGoodReq.getGoodId());
//            tCmsGoodRead.setCustomerId(cmsGoodReq.getCustomerId());
//            tCmsGoodReadMapper.insertSelective(tCmsGoodRead);
//        }
        
        
        List<TCmsGood> list=tCmsGoodMapper.selectByExample(tCmsGoodCriteria);
        return ResponseMessage.createSuccessMsg(list.get(0));
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
