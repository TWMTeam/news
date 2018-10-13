package com.there.news.mapper;

import com.there.news.entity.Comments;

import java.util.List;

public interface CommentsMapper {

    // 通过nid查找评论
    List<Comments> getCommentsByNid(int C_id);

    // 添加评论
    int addComment(Comments comments);

    // 删除某新闻下的所有评论
    int delCommentsByCNID(String N_id) ;

    // 根据ID删除评论
    int deleteComment(String C_id);
}
