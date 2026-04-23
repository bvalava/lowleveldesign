package com.striver.lld.taskmanagement.repository;

import com.striver.lld.taskmanagement.domain.User;

public interface UserRepository {

    User findById(int userId);
}
