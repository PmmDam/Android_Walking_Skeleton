package com.tfg.marta.services.UserService;

import com.tfg.marta.models.UserModel;

import java.util.List;

public interface IUserService {
    List<UserModel> getUsers();
    UserModel getUserById(String id);

    boolean login(String login,String password);
}
