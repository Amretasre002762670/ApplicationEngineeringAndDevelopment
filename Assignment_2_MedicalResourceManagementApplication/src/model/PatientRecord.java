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
public class PatientRecord extends Person {
    private long patientId;
    private String patientName;
    private ArrayList<Encounter> encounterList;
    
    Person person = new Person();
    
    public PatientRecord() {
        this.encounterList = new ArrayList<Encounter>();
    }

    public long getPatientId() {
        patientId = person.getPersonId();
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
        person.setPersonId(patientId);
    }

    public String getPatientName() {
        patientName = person.getPersonName();
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
        person.setPersonName(patientName);
    }
    
    public Encounter addEncounter() {
        Encounter newEncounter = new Encounter();
        encounterList.add(newEncounter);
        return newEncounter;
    }
    
    public Encounter updateEncounter(Encounter selectedData, int selectedEncounterInd) {
        if(encounterList.contains(selectedData)) {
            encounterList.set(selectedEncounterInd,selectedData);
        }
        return selectedData;  
    }
    
    
    
}
