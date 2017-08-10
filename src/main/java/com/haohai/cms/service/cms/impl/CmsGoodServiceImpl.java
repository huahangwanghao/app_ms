package com.haohai.cms.service.cms.impl;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.util.StringUtil;
import com.haohai.cms.mapper.TCmsGoodMapper;
import com.haohai.cms.mapper.TCmsGoodReadMapper;
import com.haohai.cms.model.TCmsGood;
import com.haohai.cms.model.TCmsGoodCriteria;
import com.haohai.cms.model.dto.CmsGoodDto;
import com.haohai.cms.model.dto.PageDto;
import com.haohai.cms.service.cms.CmsGoodService;
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
import java.util.Arrays;
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
    public ResponseMessage getCmsGoods(PageDto pageDto) {
    	ResponseMessage rm = ResponseMessage.createSuccessMsg(0);
    	JSONObject paramJson = JSONObject.parseObject(pageDto.getParamJson());
        TCmsGoodCriteria goodCriteria = new TCmsGoodCriteria();
        TCmsGoodCriteria.Criteria criteria = goodCriteria.createCriteria();
        criteria.andDataFlagEqualTo("1");//未删除记录
        if (StringUtils.isNotEmpty(paramJson.getString("goodName")))
        	criteria.andGoodNameLike("%" + paramJson.getString("goodName").trim() + "%");
        if (StringUtils.isNotEmpty(paramJson.getString("good_startdate")))
        	criteria.andCustomCriteria("DATE_FORMAT(crt_date,'%Y-%m-%d') >='" + paramJson.getString("good_startdate") + "'");
        if (StringUtils.isNotEmpty(paramJson.getString("good_enddate")))
        	criteria.andCustomCriteria("DATE_FORMAT(crt_date,'%Y-%m-%d') <='" + paramJson.getString("good_enddate") + "'");
        if (StringUtils.isNotEmpty(paramJson.getString("goodStatus")))
        	criteria.andGoodStatusEqualTo(paramJson.getString("goodStatus"));
        if (StringUtils.isNotEmpty(paramJson.getString("goodSpeci")))
        	criteria.andGoodSpeciEqualTo(paramJson.getString("goodSpeci"));
        goodCriteria.setOrderByClause(pageDto.getSortName() + " " + pageDto.getSortOrder());
        PageHelper.startPage(pageDto.getPageNumber(), pageDto.getPageSize());
        List<TCmsGood> goods = this.tCmsGoodMapper.selectByExample(goodCriteria);
        PageInfo<TCmsGood> pageInfo = new PageInfo<TCmsGood>(goods);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("total",pageInfo.getTotal());
        jsonObject.put("rows",goods);
        rm.setData(jsonObject);
        return rm;
    }

    /**
     * 保存商品
     */
    @Override
    public ResponseMessage tmSaveCmsGood(TCmsGood cmsGood) {
    	ResponseMessage rm = ResponseMessage.createSuccessMsg(0);
    	if (cmsGood.getGoodId() !=null && cmsGood.getGoodId() !=0){
    		//修改商品
    		this.tCmsGoodMapper.updateByPrimaryKeySelective(cmsGood);
    	}else{
    		//保存商品
    		cmsGood.setGoodEndTime(StringUtil.getMaxDate());
            cmsGood.setGoodStatus("1");
            cmsGood.setDataFlag("1");
            cmsGood.setCrtDate(new Date());
            this.tCmsGoodMapper.insertSelective(cmsGood);
    	}
        return rm;
    }
    
    /**
     * 批量删除商品
     */
    @Override
    public ResponseMessage tmBatchDeleteByIds(String goodIds) {
        String[] ids = goodIds.split(",");
        List<String> list = new ArrayList<String>(Arrays.asList(ids));
        this.tCmsGoodMapper.batchDeleteByIds(list);
        return ResponseMessage.createSuccessMsg(0);
    }

    /**
     * 根据商品id查询商品信息
     */
    @Override
    public ResponseMessage getCmsGoodById(Integer goodId) {
        TCmsGoodCriteria goodCriteria = new TCmsGoodCriteria();
        TCmsGoodCriteria.Criteria criteria = goodCriteria.createCriteria();
        criteria.andGoodIdEqualTo(goodId);
        CmsGoodDto good = this.tCmsGoodMapper.getCmsGoodById(goodId);
        return ResponseMessage.createSuccessMsg(good);
    }

}
