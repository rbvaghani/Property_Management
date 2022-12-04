/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

mport java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author mansi
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> reqList;
    
    public WorkQueue(){
        reqList= new ArrayList<>();
    }

    public ArrayList<WorkRequest> getReqList() {
        return reqList;
    }
    
    
    
}
