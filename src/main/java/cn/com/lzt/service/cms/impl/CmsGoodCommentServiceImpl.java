package cn.com.lzt.service.cms.impl;/**
 * Created by Administrator on 2017/8/2.
 */

import cn.com.lzt.common.ResponseMessage;
import cn.com.lzt.mapper.TCmsGoodCommentMapper;
import cn.com.lzt.model.TCmsGoodComment;
import cn.com.lzt.model.TCmsGoodCommentCriteria;
import cn.com.lzt.model.dto.CmsGoodCommentReq;
import cn.com.lzt.model.dto.PageInfoReq;
import cn.com.lzt.service.cms.CmsGoodCommentService;
import com.alibaba.fastjson.JSONArray;
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
public class CmsGoodCommentServiceImpl implements CmsGoodCommentService {
    private static final Logger logger = LoggerFactory.getLogger(CmsGoodCommentServiceImpl.class);
    @Autowired
    private TCmsGoodCommentMapper tCmsGoodCommentMapper;
    
    
    @Override
    public ResponseMessage update(TCmsGoodComment tCmsGoodComment) {
        tCmsGoodCommentMapper.updateByPrimaryKeySelective(tCmsGoodComment);
        return ResponseMessage.createSuccessMsg(0);
    }

    /**
     * 批量删除评论
     *
     * @param goodIds
     * @return
     */
    @Override
    public ResponseMessage batchDeleteByIds(String goodIds) {
        return null;
    }

    /**
     * 得到评论的分页数据
     * @param pageInfo
     * @return
     */
    @Override
    public JSONObject queryGoodComment4Page(PageInfoReq pageInfo) {

        TCmsGoodCommentCriteria tCmsGoodCommentCriteria=new TCmsGoodCommentCriteria();
        TCmsGoodCommentCriteria.Criteria criteria=tCmsGoodCommentCriteria.createCriteria();
        // tCmsGoodCommentCriteria.setOrderByClause("");
        //都是有效的评论
        //criteria.andDataFlagEqualTo("1");
        PageHelper.startPage(pageInfo.getPageNumber(),pageInfo.getPageSize());
        List<TCmsGoodComment> list=tCmsGoodCommentMapper.selectByExample(tCmsGoodCommentCriteria);
        PageInfo<TCmsGoodComment> pageInfo1=new PageInfo<TCmsGoodComment>();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("total",pageInfo1.getTotal());
        JSONArray jsonArray=new JSONArray();
        jsonArray.addAll(list);
        jsonObject.put("rows",jsonArray);
        logger.info("返回前端的信息:"+jsonObject);
        return jsonObject;
    }

    /**
     * 通过Id查询出对应的数据
     *
     * @param cmsGoodReq
     * @return
     */
    @Override
    public ResponseMessage getGoodCommentById(CmsGoodCommentReq cmsGoodReq) {
        
        TCmsGoodComment tCmsGoodComment=tCmsGoodCommentMapper.selectByPrimaryKey(cmsGoodReq.getCommentId());
        
        return ResponseMessage.createSuccessMsg(tCmsGoodComment);
    }
}
