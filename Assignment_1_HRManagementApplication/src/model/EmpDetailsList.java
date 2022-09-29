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
    
    private ArrayList<EmpDetail> empList;
    
    public EmpDetailsList() {
        
        // java creates new emp detail with the EmpDetail class. Initialing the memory. Constructor for EmpDetailsList
        this.empList = new ArrayList<EmpDetail>(); 
    }

    public ArrayList<EmpDetail> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<EmpDetail> EmpList) {
        this.empList = EmpList;
    }
    
    public EmpDetail addEmpDetails() {
        
        // function to add new employee details to the array list
        EmpDetail newEmpDetail = new EmpDetail();
        empList.add(newEmpDetail);
        return newEmpDetail;
    }
    
}
