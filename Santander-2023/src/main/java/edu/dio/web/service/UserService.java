package edu.dio.web.service;

import org.springframework.stereotype.Service;

import edu.dio.web.model.User;
@Service
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
