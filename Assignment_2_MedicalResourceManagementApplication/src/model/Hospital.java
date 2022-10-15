/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author amretasrerengarajan
 */
public class Hospital {
    private String hosName;
    private long hosHelpLine;
    private String hosCity;
    private String hosCommunity;
    private long picode;

    public String getHosName() {
        return hosName;
    }

    public void setHosName(String hosName) {
        this.hosName = hosName;
    }

    public long getHosHelpLine() {
        return hosHelpLine;
    }

    public void setHosHelpLine(long hosHelpLine) {
        this.hosHelpLine = hosHelpLine;
    }

    public String getHosCity() {
        return hosCity;
    }

    public void setHosCity(String hosCity) {
        this.hosCity = hosCity;
    }

    public String getHosCommunity() {
        return hosCommunity;
    }

    public void setHosCommunity(String hosCommunity) {
        this.hosCommunity = hosCommunity;
    }

    public long getPicode() {
        return picode;
    }

    public void setPicode(long picode) {
        this.picode = picode;
    }
    
    @Override // we will be using a method that will override the Object class that is inherited
    public String toString() { 
        return hosName; 
    }
    
}
