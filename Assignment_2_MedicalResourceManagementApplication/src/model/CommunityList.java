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
public class CommunityList {
    ArrayList<Community> commList;

    public CommunityList() {
        commList = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommList() {
        return commList;
    }

    public void setCommList(ArrayList<Community> commList) {
        this.commList = commList;
    }
    
    public Community addCommunityAdmin() {
        Community newCommAdmin = new Community();
        commList.add(newCommAdmin);
        return newCommAdmin;
    }
}
