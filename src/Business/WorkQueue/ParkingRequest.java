/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author mansi
 */
public class ParkingRequest extends WorkRequest {
    
    private int numOfSlots;
    private String parkingLoc;
    
     private double reqCharges;

    public double getReqCharges() {
        return reqCharges;
    }

    public void setReqCharges(double reqCharges) {
        this.reqCharges = reqCharges;
    }

    public int getNumOfSlots() {
        return numOfSlots;
    }

    public void setNumOfSlots(int numOfSlots) {
        this.numOfSlots = numOfSlots;
    }

    public String getParkingLoc() {
        return parkingLoc;
    }

    public void setParkingLoc(String parkingLoc) {
        this.parkingLoc = parkingLoc;
    }
    
}
