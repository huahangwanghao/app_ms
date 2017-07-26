package cn.com.lzt.service.cms;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsGood;
import cn.com.lzt.model.dto.CmsGoodReq;
import cn.com.lzt.model.dto.PageInfoReq;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by Administrator on 2017/7/20.
 */
public interface CmsGoodService {
    ResponseMessage save(TCmsGood tCmsGood);

    /**
     * 通过条件查询商品信息
     * @param cmsGoodReq
     * @return
     */
    ResponseMessage queryByCondition(CmsGoodReq cmsGoodReq);

    /**
     * 修改商品信息
     * @param tCmsGood
     * @return
     */
    ResponseMessage update(TCmsGood tCmsGood);

    /**
     * 批量删除
     * @param goodIds
     * @return
     */
    ResponseMessage batchDeleteByIds(String goodIds);

    /**
     * 分页信息查询
     * @param pageInfo
     * @return
     */
    JSONObject query4Page(PageInfoReq pageInfo);
}
