package com.haohai.cms.service.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsGood;
import com.haohai.cms.model.dto.PageDto;

public interface CmsGoodService {
	
	/**
	 * 查询商品列表
	 * @param pageDto
	 * @return
	 */
	ResponseMessage getCmsGoods(PageDto pageDto);
	
    /**
     * 保存商品
     * @param cmsGood
     * @return
     */
    ResponseMessage tmSaveCmsGood(TCmsGood cmsGood);
    
    /**
     * 批量删除商品
     * @param goodIds
     * @return
     */
    ResponseMessage tmBatchDeleteByIds(String goodIds);
    
    /**
     * 根据商品id查询商品信息
     * @param goodId
     * @return
     */
    ResponseMessage getCmsGoodById(Integer goodId);

}
