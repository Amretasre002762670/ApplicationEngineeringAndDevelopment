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
public class HospitalList {
    ArrayList<Hospital> hospitalList;

    public ArrayList<Hospital> getHospital() {
        return hospitalList;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        this.hospitalList = hospital;
    }
    
    public HospitalList() {
        this.hospitalList = new ArrayList<Hospital>();
    }
    
    public Hospital addHospitals() {
        Hospital newHosp = new Hospital();
        hospitalList.add(newHosp);
        return newHosp;
    }
    
    public ArrayList<Hospital> searchHosName(String searchName) {
        ArrayList<Hospital> searchResult = new ArrayList<Hospital>();
        for (Hospital hos: hospitalList) {
                if(hos.getHosName().equals(searchName)) {
                    searchResult.add(hos);
                }
            }
        return searchResult;
    }
    
    public ArrayList<Hospital> searchHosPincode(long searchPincode) {
        ArrayList<Hospital> searchResult = new ArrayList<Hospital>();
        for (Hospital hos: hospitalList) {
                if(hos.getPicode() == searchPincode) {
                    searchResult.add(hos);
                }
            }
        return searchResult;
    }
    
    public ArrayList<Hospital> searchHosCommunity(String searchCommunity) {
        ArrayList<Hospital> searchResult = new ArrayList<Hospital>();
        for (Hospital hos: hospitalList) {
                if(hos.getHosCommunity().equals(searchCommunity)) {
                    searchResult.add(hos);
                }
            }
        return searchResult;
    }
    
    public int checkHospitalListSize() {
        return hospitalList.size();
    }
    
    public Hospital updateHospitalDetails(Hospital selectedHospital, int selectedHosInd) {
        if(hospitalList.contains(selectedHospital)) {
            hospitalList.set(selectedHosInd, selectedHospital);
        }
        return selectedHospital;
    }
}
