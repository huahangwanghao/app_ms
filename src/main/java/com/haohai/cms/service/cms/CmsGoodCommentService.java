package com.haohai.cms.service.cms;

import com.haohai.cms.common.ResponseMessage;
import com.haohai.cms.model.TCmsGoodComment;
import com.haohai.cms.model.dto.CmsGoodCommentReq;

/**
 * Created by Administrator on 2017/8/2.
 */
public interface CmsGoodCommentService {
    ResponseMessage update(TCmsGoodComment tCmsGoodComment);

    /**
     * 批量删除评论
     * @param goodIds
     * @return
     */
    ResponseMessage batchDeleteByIds(String goodIds);

    ResponseMessage queryGoodComment4Page(CmsGoodCommentReq pageInfo);

    /**
     * 通过Id查询出对应的数据
     * @param cmsGoodReq
     * @return
     */
    ResponseMessage getGoodCommentById(CmsGoodCommentReq cmsGoodReq);
}
