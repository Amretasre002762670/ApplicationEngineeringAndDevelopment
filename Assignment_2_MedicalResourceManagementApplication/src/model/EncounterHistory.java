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
public class EncounterHistory {

    ArrayList<Encounter> encounterList;

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public EncounterHistory() {
        this.encounterList = new ArrayList<Encounter>();
    }

    public Encounter addEncounter(Encounter newEncounter) {
//        Encounter newEncounter = new Encounter();
        encounterList.add(newEncounter);
        return newEncounter;
    }

    public Encounter updateEncounter(String updateRecordEncounter) {
        Encounter updatedEncounter = null;
        for (Encounter enc : encounterList) {
            if (enc.getDateTaken().equals(updateRecordEncounter)) {
                break;
            }
            updatedEncounter = enc;
        }
        return updatedEncounter;
    }
    
    public void removeEncounter(Encounter enc) {
        encounterList.remove(enc);
    }

    public int encounterHistorySize() {
        return encounterList.size();
    }

}
