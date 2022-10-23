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
    
    public Person addPersonRecord() {
        Person newPerson = new Person();
        userList.add(newPerson);
        return newPerson;        
    }

    //method to add new users to user list
    public Person addPersonAddressDetails(Person newPerson) {
        userList.add(newPerson);
        return newPerson;
    }

    public boolean checkPersonDetailsExist(long patientId, String patientName) {
        boolean result = false;
        for (Person prsn : userList) {
            result = ((prsn.getPersonId() == patientId) && (prsn.getPersonName().equals(patientName)));
            break;
        }
        return result;
    }

    public int checkSizePersonRecord() {
        return userList.size();
    }

    public boolean searchPersonByPatientID(long patientID) {
        boolean searchResult = false;
        for (Person person : userList) {
            searchResult = (person.getPersonId() == patientID);
            break;
        }
        return searchResult;
    }

    public Person getPersonDetailsWithPatientId(long patientID) {
        Person searchResult = new Person();
        for (Person person : userList) {
            if (person.getPersonId() == patientID) {
                break;
            }
        }
        return searchResult;
    }

    public boolean searchPersonByPatientName(String patientName) {
        boolean searchResult = false;
        for (Person person : userList) {
            searchResult = person.getPersonName().equals(patientName);
            break;
        }
        return searchResult;
    }

    public Person getPersonDetailsWithPatientName(String patientName) {
        Person searchResult = new Person();
        for (Person person : userList) {
            if (person.getPersonName().equals(patientName)) {
                searchResult = person;
                break;
            }
        }
        return searchResult;
    }

}
