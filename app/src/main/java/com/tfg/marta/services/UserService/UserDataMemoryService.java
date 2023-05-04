package com.tfg.marta.services.UserService;

import com.tfg.marta.data.DataMemory;
import com.tfg.marta.models.UserModel;

import java.util.List;

public class UserDataMemoryService implements IUserService {

    private DataMemory data = new DataMemory();

    @Override
    public List<UserModel> getUsers() {
        return data.users;
    }

    @Override
    public UserModel getUserById(String id) {

        UserModel selectedUser = null;
        for (UserModel user : data.users) {
            if(user.getId().equals(id)){
                selectedUser = user;
            }
        }
        return selectedUser;
    }

    @Override
    public boolean login(String login, String password) {

        boolean isLogged = false;
        for (UserModel user : data.users) {
            if(user.getLogin().equals(login)){
                if(user.getPassword().equals(password)){
                    isLogged =true;
                }
            }
        }
        return true;
    }
}
