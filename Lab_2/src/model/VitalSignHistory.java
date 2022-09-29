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
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> history;
    
    public VitalSignHistory() {
        this.history = new ArrayList<VitalSigns>(); // java creates new history with the vitalSigns class. Initialing the memory.
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVital() { // creating a method of type vitalSigns
        VitalSigns newVital = new VitalSigns(); // create empty vital signs
        history.add(newVital); // add the vital sign to history
        return newVital; // returns the reference so that new data can be added
    }
    
    public void deleteVitals(VitalSigns vs) {
        
        history.remove(vs);
        
    }
}
