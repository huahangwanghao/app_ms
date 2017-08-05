package com.haohai.cms.service.cms.impl;/**
 * Created by Administrator on 2017/8/2.
 */

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.common.util.JsonUtil;
import com.haohai.cms.mapper.TCmsGoodCategoryMapper;
import com.haohai.cms.model.TCmsGoodCategory;
import com.haohai.cms.model.TCmsGoodCategoryCriteria;
import com.haohai.cms.model.dto.CmsGoodCategoryReq;
import com.haohai.cms.service.cms.CmsGoodCategoryService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 评论的实现类
 *
 * @author WangH
 * @create 2017-08-02 16:41
 **/
@Service
@Transactional
public class CmsGoodCategoryServiceImpl implements CmsGoodCategoryService {
    private static final Logger logger = LoggerFactory.getLogger(CmsGoodCategoryServiceImpl.class);
    @Autowired
    private TCmsGoodCategoryMapper tCmsGoodCategoryMapper;


    /**
     * 增加商品分类
     *
     * @param tCmsGoodCategory
     * @return
     */
    @Override
    public ResponseMessage insert(TCmsGoodCategory tCmsGoodCategory) {
        tCmsGoodCategoryMapper.insertSelective(tCmsGoodCategory);
        return ResponseMessage.createSuccessMsg(0);
    }

    /**
     * 得到所有的分类信息
     * @return
     */
    @Override
    public ResponseMessage selectAllCategoryList() {
        TCmsGoodCategoryCriteria tCmsGoodCategoryCriteria=new TCmsGoodCategoryCriteria();
        TCmsGoodCategoryCriteria.Criteria criteria=tCmsGoodCategoryCriteria.createCriteria();
        criteria.andDataFlagEqualTo("1");
        List<TCmsGoodCategory> list=tCmsGoodCategoryMapper.selectByExample(tCmsGoodCategoryCriteria);
        return ResponseMessage.createSuccessMsg(list);
    }

    /**
     * 得到分类信息的分页信息
     *
     * @param cmsGoodCategoryReq
     * @return
     */
    @Override
    public ResponseMessage selectCategoryList4Page(CmsGoodCategoryReq cmsGoodCategoryReq) {
        TCmsGoodCategoryCriteria tCmsGoodCategoryCriteria=new TCmsGoodCategoryCriteria();
        TCmsGoodCategoryCriteria.Criteria criteria=tCmsGoodCategoryCriteria.createCriteria();
        criteria.andDataFlagEqualTo("1");
        PageHelper.offsetPage(cmsGoodCategoryReq.getPageNumber(),cmsGoodCategoryReq.getPageSize());
        List<TCmsGoodCategory> list=tCmsGoodCategoryMapper.selectByExample(tCmsGoodCategoryCriteria);
        PageInfo<TCmsGoodCategory> pageInfo1=new PageInfo<>();
        long total=pageInfo1.getTotal();
        JSONObject jsonObject= JsonUtil.getPageInfo2JsonObject(total,list);
        //TODO 判断是否需要使用Response形式还是使用JsonObject形式返回数据.
        return ResponseMessage.createSuccessMsg(jsonObject);
    }
}
