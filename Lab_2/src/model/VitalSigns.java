/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anany
 */
public class VitalSigns {

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }
    String date;
    double bloodPressure;
    double Temperature;
    int pulse;
    
    public String toString(){
        return getDate();
    }
}
