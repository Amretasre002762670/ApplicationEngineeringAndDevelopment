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
public class DoctorList {
    ArrayList<Doctor> doctorList;

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public DoctorList() {
        doctorList = new ArrayList<Doctor>();
    }
    
    public int checkSizeDoctorList() {
        return doctorList.size();
    }
    
    public Doctor addDoctor() {
        Doctor newDoctor = new Doctor();
        doctorList.add(newDoctor);
        return newDoctor; 
    }
    
    public Doctor updateDoctorDetails(Doctor selectedDoctor, int doctorInd) {
        if(doctorList.contains(selectedDoctor)) {
            doctorList.set(doctorInd, selectedDoctor);
        }
        return selectedDoctor;
    }
    
    public void removePersonDetails(Doctor doctorRemove) {
        doctorList.remove(doctorRemove);
    }
    
    public ArrayList<Doctor> searchDocName(String searchName) {
        ArrayList<Doctor> searchResult = new ArrayList<Doctor>();
        for (Doctor doc: doctorList) {
                if(doc.getDoctorName().equals(searchName)) {
                    searchResult.add(doc);
                }
            }
        return searchResult;
    }
    
    public ArrayList<Doctor> searchDocHospName(String searchHospName) {
        ArrayList<Doctor> searchResult = new ArrayList<Doctor>();
        for (Doctor doc: doctorList) {
                if(doc.getDoctorHospName().equals(searchHospName)) {
                    searchResult.add(doc);
                }
            }
        return searchResult;
    }
    
    public ArrayList<Doctor> searchDocDept(String searchDocDept) {
        ArrayList<Doctor> searchResult = new ArrayList<Doctor>();
        for (Doctor doc: doctorList) {
                if(doc.getDoctorDept().equals(searchDocDept)) {
                    searchResult.add(doc);
                }
            }
        return searchResult;
    }
    
    public ArrayList<Doctor> searchDocComm(String searchDocComm) {
        ArrayList<Doctor> searchResult = new ArrayList<Doctor>();
        for (Doctor doc: doctorList) {
                if(doc.getDoctorHospComm().equals(searchDocComm)) {
                    searchResult.add(doc);
                }
            }
        return searchResult;
    }
    
}
