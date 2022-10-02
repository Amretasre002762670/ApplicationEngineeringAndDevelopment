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
    
    public ArrayList<EmpDetail> addEmpToList(EmpDetail empDet) {
        empList.add(empDet);
        for (EmpDetail emp: empList) {
            System.out.println(emp);
        }
        return empList;
    }
    
    public void removeEmpDetails(EmpDetail empDet) {
        
        empList.remove(empDet);
        
        //method to remove an employee from the list
//        for (EmpDetail emp: empList) {
//            if(emp.getEmpId() == empDet.getEmpId()) {
//                empList.remove(emp);
//            }
//        }
    }
    
    public EmpDetail updateEmpDetails(EmpDetail emp, int selectedEmpInd) {
        if(empList.contains(emp)) {
            empList.set(selectedEmpInd, emp);
        }
        return emp;
    }
    
    public Object searchEmpDetailsWithInt (String searchType, long searchValue) {
        EmpDetail searchResult = new EmpDetail();
            for (EmpDetail emp: empList) {
                if(emp.getEmpId() == searchValue) {
                    searchResult = emp;
                }
            }
        return searchResult;
    }
    
    public ArrayList<EmpDetail> searchDetailWithName(String searchValue) {
        ArrayList<EmpDetail> searchResult = new ArrayList<EmpDetail>();
        for (EmpDetail emp: empList) {
                if(emp.getName().equals(searchValue)) {
                    searchResult.add(emp);
                }
            }
        
        return searchResult;
    } 
    
    public ArrayList<EmpDetail> searchDetailWithLevel(String searchValue) {
        ArrayList<EmpDetail> searchResult = new ArrayList<EmpDetail>();
        for (EmpDetail emp: empList) {
                if(emp.getLevel().equals(searchValue)) {
                    searchResult.add(emp);
                }
            }
        
        return searchResult;
    }
    
    public ArrayList<EmpDetail> searchDetailWithPosition(String searchValue) {
        ArrayList<EmpDetail> searchResult = new ArrayList<EmpDetail>();
        for (EmpDetail emp: empList) {
                if(emp.getPositionTitle().equals(searchValue)) {
                    searchResult.add(emp);
                }
            }
        
        return searchResult;
    }
    
    public ArrayList<EmpDetail> searchDetailWithTeam(String searchValue) {
        ArrayList<EmpDetail> searchResult = new ArrayList<EmpDetail>();
        for (EmpDetail emp: empList) {
                if(emp.getTeamInfo().equals(searchValue)) {
                    searchResult.add(emp);
                }
            }
        
        return searchResult;
    }
    
    public int checkSize() {
        return empList.size();
    }
    
//    public int getTotalNoEmp(EmpDetailsList list) {
//        int count = 0;
//        for(EmpDetails emp: list) {
//            count++;
//        }
//        return count;
//    }
    
}
