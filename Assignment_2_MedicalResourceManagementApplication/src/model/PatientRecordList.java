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
    PersonList personList;

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
    
    public boolean checkPatientRecordExist(long patientId, String patientName) {
        boolean isExist = false;
        for (PatientRecord patRec : patientRecordList) {
            isExist = ((patRec.getPatientId() == patientId) && (patRec.getPatientName().equals(patientName)));
            break;
        }
        return isExist;
    }

    public PatientRecord searchPatientRecordView(long patientId, String patientName) {
        PatientRecord result = new PatientRecord();
        for (PatientRecord patRec : patientRecordList) {
            result = ((patRec.getPatientId() == patientId) && (patRec.getPatientName().equals(patientName))) ? patRec : null;
        }
        return result;
    }

    public int checkSizePatientRecord() {
        return patientRecordList.size();
    }

    public PatientRecord createNewPatientRecord(long patientID, String patientName, Encounter encounter) {
        PatientRecord newPatient = new PatientRecord();
        newPatient.setPatientId(patientID);
        newPatient.setPatientName(patientName);
//        newPatient.addEncounterToEncounterList(encounter);
        patientRecordList.add(newPatient);
        return newPatient;
    }
    
    public boolean checkPatientRecordExistInPersonList(long patientID, String patientName, PersonList personList, PatientRecordList patientList, Encounter encounter) {
        boolean result = false;
        
        for(PatientRecord patient: patientList.getPatientRecordList()) {
            if((patient.getPatientId() == patientID) && (patient.getPatientName().equals(patientName))) {
                result = true;
                break;
            } else {
                patientList.createNewPatientRecord(patientID, patientName, encounter);
                result = false;
            }
//            patient.addEncounterToEncounterList(encounter);
        }
        return result;
    }
    
    public boolean addEncounterToExistingPatient(long patientID, String patientName, Encounter encounter, PatientRecordList patientRecordHis) {
        boolean result =false;
        
        for(PatientRecord patientRec: patientRecordHis.getPatientRecordList()) {
            if((patientRec.getPatientId() == patientID) && (patientRec.getPatientName().equals(patientName))) {
//                patientRec.addEncounterToEncounterList(encounter);
                result = true;
                break;
            } 
        }
        return result;
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
