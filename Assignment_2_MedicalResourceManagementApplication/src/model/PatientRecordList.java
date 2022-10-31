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
public class PatientRecordList  {

    ArrayList<PatientRecord> patientRecordList;

    public ArrayList<PatientRecord> getPatientRecordList() {
        return patientRecordList;
    }

    public void setPatientRecordList(ArrayList<PatientRecord> patientRecordList) {
        this.patientRecordList = patientRecordList;
    }

    public PatientRecordList() {
        this.patientRecordList = new ArrayList<PatientRecord>();
    }

    public PatientRecord addPatientRecord() {
        PatientRecord newPatient = new PatientRecord();
        patientRecordList.add(newPatient);
        return newPatient;
    }

    public int checkSizePatientRecord() {
        return patientRecordList.size();
    }
    
    public boolean searchPersonByPatientID(long patientID) {
        boolean searchResult = false;
        for (PatientRecord patient : patientRecordList) {
            searchResult = (patient.getPersonId() == patientID);
            break;
        }
        return searchResult;
    }

    public PatientRecord getPersonDetailsWithPatientId(long patientID) {
        PatientRecord searchResult = new PatientRecord();
        for (PatientRecord patient : patientRecordList) {
            if (patient.getPersonId() == patientID) {
                searchResult = patient;
                break;
            }
        }
        return searchResult;
    }

    public boolean searchPersonByPatientName(String patientName) {
        boolean searchResult = false;
        for (PatientRecord patient : patientRecordList) {
            searchResult = patient.getPersonName().equals(patientName); 
            break;
        }
        return searchResult;
    }

    public PatientRecord getPersonDetailsWithPatientName(String patientName) {
        PatientRecord searchResult = new PatientRecord();
        for (PatientRecord patient : patientRecordList) {
            if (patient.getPersonName().equals(patientName)) {
                searchResult = patient;
                break;
            }
        }
        return searchResult;
    }

}
