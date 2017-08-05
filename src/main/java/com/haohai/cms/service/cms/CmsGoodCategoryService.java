package com.haohai.cms.service.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsGoodCategory;
import com.haohai.cms.model.dto.CmsGoodCategoryReq;

/**
 * Created by Administrator on 2017/8/2.
 */
public interface CmsGoodCategoryService {

    /**
     * 增加商品分类
     * @param tCmsGoodCategory
     * @return
     */
    ResponseMessage insert(TCmsGoodCategory tCmsGoodCategory);
    
    ResponseMessage selectAllCategoryList();

    /**
     * 得到分类信息的分页信息
     * @param cmsGoodCategoryReq
     * @return
     */
    ResponseMessage selectCategoryList4Page(CmsGoodCategoryReq cmsGoodCategoryReq);
}
