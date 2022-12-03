/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author mansi
 */

    public class ElectricityWorkRequest extends WorkRequest{
   private double reqCharges;
   private int elec_bill_days;
   
   public double getReqCharges() {
        return reqCharges;
    }

    public void setReqCharges(double reqCharges) {
        this.reqCharges = reqCharges;
    }

    public int getElec_bill_days() {
        return elec_bill_days;
    }

    public void setElec_bill_days(int elec_bill_days) {
        this.elec_bill_days = elec_bill_days;
    }
    
    
    
    
}
    
}
