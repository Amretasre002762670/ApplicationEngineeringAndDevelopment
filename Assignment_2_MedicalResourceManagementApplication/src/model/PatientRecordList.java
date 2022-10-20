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
public class PatientRecordList extends PersonList {
    
    ArrayList<PatientRecord> patientRecordList;
    PersonList personList;

    public PatientRecordList() {
        this.patientRecordList = new ArrayList<PatientRecord>();
    }
    
    public PatientRecordList(PersonList personList) {
        this.personList = personList;
    }
    
    public PatientRecord addPatientRecord() {
        PatientRecord newPatient = new PatientRecord();
        patientRecordList.add(newPatient);
        return newPatient;
        
    }
    
    public boolean checkPatientRecordExist(long patientId, String patientName) {
        boolean isExist = false;
        for(PatientRecord patRec: patientRecordList) {
            isExist = ((patRec.getPatientId() == patientId) && (patRec.getPatientName().equals(patientName)));
        }
        return isExist;
    }
    
    public int checkSizePatientRecord() {
        return patientRecordList.size();
    }
    
}
