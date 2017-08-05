package com.haohai.cms.mapper;

import com.haohai.cms.model.TCmsGoodComment;
import com.haohai.cms.model.TCmsGoodCommentCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TCmsGoodCommentMapper {
    int countByExample(TCmsGoodCommentCriteria example);

    int deleteByExample(TCmsGoodCommentCriteria example);

    int deleteByPrimaryKey(Long commentId);

    int insert(TCmsGoodComment record);

    int insertSelective(TCmsGoodComment record);

    List<TCmsGoodComment> selectByExample(TCmsGoodCommentCriteria example);

    TCmsGoodComment selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") TCmsGoodComment record, @Param("example") TCmsGoodCommentCriteria example);

    int updateByExample(@Param("record") TCmsGoodComment record, @Param("example") TCmsGoodCommentCriteria example);

    int updateByPrimaryKeySelective(TCmsGoodComment record);

    int updateByPrimaryKey(TCmsGoodComment record);

    /**
     * 得到评论的分页数据
     * @return
     */
    List<TCmsGoodComment> getCommentPageInfo(Map<String,String> param);
}