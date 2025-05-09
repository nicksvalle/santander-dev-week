package com.nicolas.service;

import com.nicolas.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
