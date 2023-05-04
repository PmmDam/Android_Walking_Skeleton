package com.tfg.marta.models;

import android.widget.Toast;

public class UserModel {

    //Properties
    private String id;
    private String name;
    private String lastName;
    private String login;
    private String email;
    private String password;
    private Gender gender;

    //Constructor
    public UserModel(String id, String name, String lastName, String login, String email, String password, Gender gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    //Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setGender(String gender) {
        Gender currentGender = Gender.NONE;

        try{
            currentGender = Gender.valueOf(gender);
        }
        catch (IllegalArgumentException e){
            System.out.println("Parameter not valid");
        }
        this.gender = currentGender;
    }
}
