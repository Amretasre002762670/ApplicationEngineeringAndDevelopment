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
public class EmpDetailsList {
    
    private ArrayList<EmpDetail> EmpList;

    public ArrayList<EmpDetail> getEmpList() {
        return EmpList;
    }

    public void setEmpList(ArrayList<EmpDetail> EmpList) {
        this.EmpList = EmpList;
    }
    
    public EmpDetail addEmpDetails() {
        // function to add new employee details to the array list
        EmpDetail newEmpDetail = new EmpDetail();
        EmpList.add(newEmpDetail);
        return newEmpDetail;
  
    }
    
}
