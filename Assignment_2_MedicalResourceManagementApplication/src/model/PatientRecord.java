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

    ArrayList<Encounter> encounterList;
    
    public PatientRecord() {
        encounterList = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Encounter addEncounters() {
        Encounter newEncounter = new Encounter();
        encounterList.add(newEncounter);
        return newEncounter;
    }
    
    public Encounter updateEncounter(Encounter updatedEncounter, int ind) {
        if(encounterList.contains(updatedEncounter)) {
            encounterList.set(ind, updatedEncounter);
        }
        return updatedEncounter;
    }
    
    public int checkSizeOfEncounters() {
        return encounterList.size();
    }
    
}
