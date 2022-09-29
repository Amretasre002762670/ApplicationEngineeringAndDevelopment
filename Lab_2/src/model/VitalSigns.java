/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author amretasrerengarajan
 */
public class VitalSigns {
    
    private double temperature;
    private double bloodPressure;
    private int pulse;
    private String date;

    public double getTemperature() {
        return temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public String getDate() {
        return date;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override // we will be using a method that will override the Object class that is inherited
    public String toString() { 
        return date; 
    }
    
    
}
