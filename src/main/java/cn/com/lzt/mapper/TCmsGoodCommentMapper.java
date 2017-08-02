package cn.com.lzt.mapper;

import cn.com.lzt.model.TCmsGoodComment;
import cn.com.lzt.model.TCmsGoodCommentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}