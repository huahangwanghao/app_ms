package cn.com.lzt.service.cms;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsGoodComment;
import cn.com.lzt.model.dto.CmsGoodReq;
import cn.com.lzt.model.dto.PageInfoReq;
import com.alibaba.fastjson.JSONObject;

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

    JSONObject queryGoodComment4Page(PageInfoReq pageInfo);

    /**
     * 通过Id查询出对应的数据
     * @param cmsGoodReq
     * @return
     */
    ResponseMessage getGoodCommentById(CmsGoodReq cmsGoodReq);
}
