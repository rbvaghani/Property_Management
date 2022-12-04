/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author mansi
 */
public class WaterWorkRequest extends WorkRequest{
    private double reqCharges;
    private int water_bill_days;
   
   public double getReqCharges() {
        return reqCharges;
    }

    public void setReqCharges(double reqCharges) {
        this.reqCharges = reqCharges;
    }

    public int getWater_bill_days() {
        return water_bill_days;
    }

    public void setWater_bill_days(int water_bill_days) {
        this.water_bill_days = water_bill_days;
    }
    
    
}