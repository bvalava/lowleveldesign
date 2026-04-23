package com.striver.lld.taskmanagement.repository;

import com.striver.lld.taskmanagement.domain.Comment;

import java.util.List;

public interface CommentRepository {

    Comment save(Comment comment);
    List<Comment> findByTaskId(int taskId);
}
