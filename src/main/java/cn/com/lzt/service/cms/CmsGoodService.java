package cn.com.lzt.service.cms;

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.model.TCmsGood;
import cn.com.lzt.model.dto.CmsGoodReq;

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
}
