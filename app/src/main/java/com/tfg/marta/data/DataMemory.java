package com.tfg.marta.data;

import com.tfg.marta.models.Gender;
import com.tfg.marta.models.TrainingModel;
import com.tfg.marta.models.UserModel;

import java.util.ArrayList;
import java.util.List;

public class DataMemory {

    public List<UserModel> users = new ArrayList<>();
    public List<TrainingModel> trainings = new ArrayList<>();


    public DataMemory() {
        initialize();
    }

    private void initialize() {

        initializeUsers();
        initializeTrainings();
    }


    private void initializeUsers() {
        users.add(new UserModel("1111111aaaaaa","Name1","LastName1","Login1","FakeEmail1@gmail.com","Prueba01", Gender.FEMALE));
        users.add(new UserModel("2222222bbbbbb","Name2","LastName2","Login2","FakeEmail2@gmail.com","Prueba02", Gender.MALE));
        users.add(new UserModel("3333333cccccc","Name3","LastName3","Login3","FakeEmail3@gmail.com","Prueba03", Gender.FEMALE));
        users.add(new UserModel("4444444dddddd","Name4","LastName4","Login4","FakeEmail4@gmail.com","Prueba04", Gender.FEMALE));
        users.add(new UserModel("5555555eeeeee","Name5","LastName5","Login5","FakeEmail5@gmail.com","Prueba05", Gender.OTHERS));

    }

    private void initializeTrainings() {
        trainings.add(new TrainingModel("aaaaaa1111111","Training name 1","Training Url 1","https://picsum.photos/200/300"));
        trainings.add(new TrainingModel("bbbbbb2222222","Training name 2","Training Url 2","https://picsum.photos/230/301"));
        trainings.add(new TrainingModel("cccccc3333333","Training name 3","Training Url 3","https://picsum.photos/240/430"));
        trainings.add(new TrainingModel("dddddd4444444","Training name 4","Training Url 4","https://picsum.photos/250/200"));
        trainings.add(new TrainingModel("eeeeee5555555","Training name 5","Training Url 5","https://picsum.photos/260/320"));

    }

}
