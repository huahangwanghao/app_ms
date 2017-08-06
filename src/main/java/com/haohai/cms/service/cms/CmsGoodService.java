package com.haohai.cms.service.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsGood;
import com.haohai.cms.model.dto.CmsGoodDto;
import com.alibaba.fastjson.JSONObject;

public interface CmsGoodService {
	
	/**
	 * 查询商品列表
	 * @param goodDto
	 * @return
	 */
	JSONObject getGoods(CmsGoodDto goodDto);
	
	/**
	 * 新增商品
	 * @param cmsGood
	 * @return
	 */
    ResponseMessage addCmsGood(TCmsGood cmsGood);
    
    /**
     * 修改商品信息
     * @param tCmsGood
     * @return
     */
    ResponseMessage updateCmsGood(TCmsGood tCmsGood);
    
    /**
     * 批量删除商品
     * @param goodIds
     * @return
     */
    ResponseMessage batchDeleteByIds(String goodIds);
    
    
    
    
    
    
    
    
    

    /**
     * 通过条件查询商品信息
     * @param cmsGoodReq
     * @return
     */
    ResponseMessage queryByCondition(CmsGoodDto cmsGoodReq);

    

}
