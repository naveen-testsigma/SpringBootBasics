package com.operations.crud.service;
import com.operations.crud.controller.UserDTO;
import com.operations.crud.entity.User;

import org.modelmapper.ModelMapper;
import java.util.List;
public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
    UserDTO getUser(int userId);
}
