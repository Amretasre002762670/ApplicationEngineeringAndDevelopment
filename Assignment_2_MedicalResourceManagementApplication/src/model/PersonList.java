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
public class PersonList {
    
    private ArrayList<Person> userList;
    
    
    // getter function for user list
    public ArrayList<Person> getUserList() {
        return userList;
    }

    // setter method for user list
    public void setUserList(ArrayList<Person> userList) {
        this.userList = userList;
    }
    
    //constructor
    public PersonList() {
        
        //initialising the array list with Person type
        this.userList = new ArrayList<Person>();
    }
    
    //method to add new users to user list
    public Person addUsers() {
        Person newUser = new Person();
        userList.add(newUser);
        return newUser;
    }
    
}
