/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author amretasrerengarajan
 */
public class LoginClass {

    ArrayList<Login> loginList;

    public LoginClass() {
        this.loginList = new ArrayList<Login>();
    }

    public ArrayList<Login> getLoginList() {
        return loginList;
    }

    public void setLoginList(ArrayList<Login> loginList) {
        this.loginList = loginList;
    }

    public Login addUsers() {
        Login newUser = new Login();
        loginList.add(newUser);
        return newUser;
    }

    public Login updateUserInfo(Login updateUser, int ind) {
        if (loginList.contains(updateUser)) {
            loginList.set(ind, updateUser);
        }
        return updateUser;
    }

    public void deleteUser(Login deleteUser) {
        loginList.remove(deleteUser);
    }

    public Login searchUserLogin(Login searchUser) {
        Login searchResult = new Login();
        for (Login user : loginList) {
            if ((user.getUserName().equals(searchUser.getUserName()))
                    && (user.getPassword().equals(user.getPassword()))
                    && (user.getUserType().equals("Doctor"))) {
                searchResult = user;
                break;
            } else if ((user.getUserName().equals(searchUser.getUserName()))
                    && (user.getPassword().equals(user.getPassword()))
                    && (user.getUserType().equals("Community"))) {
                searchResult = user;
                break;
            } else if ((user.getUserName().equals(searchUser.getUserName()))
                    && (user.getPassword().equals(user.getPassword()))
                    && (user.getUserType().equals("User"))) {
                searchResult = user;
                break;
            } else {
                searchResult = null;
            }
        }
        return searchResult;
    }

}
