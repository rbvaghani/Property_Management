/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utility;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author mansi
 */
public class Notification {

    private LinkedHashMap<String, Boolean> notificationList;

    public Notification() {
        notificationList = new LinkedHashMap<>();
    }

    public void addNotification(WorkRequest wr) {
        String notifMsg = null;
        UserAccount receiver= wr.getReceiver() ;
        if(receiver==null){
            
            receiver= new UserAccount();
            receiver.setUserName("ADMIN");
        }
        if (wr.getStatus().equals("CLOSED")) {
            notifMsg = wr.getResolveDate() + "::" + "You request has been CLOSED by " + receiver + " with message- " + wr.getMessage() + " Thank You.";
        } else if (wr.getStatus().equals("OPEN")) {
            Date date = new Date();
            notifMsg = date + "::" + "You request is " + wr.getStatus() + " and is ASSIGNED to " + receiver + " with message- " + wr.getMessage() + " It will be resolved soon. Thank You.";

        } else if (wr.getStatus().equals("ASSIGNED")) {
            Date date = new Date();

            notifMsg = date + "::" + "You request is successfully ASSIGNED to " + receiver + " with message- " + wr.getMessage() + " It will be resolved soon. Thank You.";
        }else if (wr.getStatus().equalsIgnoreCase("CANCELLED")) {
            Date date = new Date();

            notifMsg = date + "::" + "You request is CANCELLED by " + receiver + " with message- " + wr.getMessage() + " Thank You.";
        }else{
             Date date = new Date();

            notifMsg = date + "::" + "You request is successfully ASSIGNED to " + receiver + " with message- " + wr.getMessage() + " It will be resolved soon. Thank You.";
            
        }
        

        notificationList.put(notifMsg, Boolean.FALSE);
    }

    public int getTotalNotifications() {
        return notificationList.size();
    }

    public int getUnreadNotifications() {
        int unreadNotifications = 0;

        Iterator it = notificationList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            Boolean isRead = (Boolean) pair.getValue();
            if (!isRead) {
                unreadNotifications++;
            }

        }

        return unreadNotifications;
    }

    public int getReadNotifications() {

        int readNotifications = 0;

        Iterator it = notificationList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            Boolean isRead = (Boolean) pair.getValue();
            if (isRead) {
                readNotifications++;
            }

        }

        return readNotifications;

    }

    public LinkedHashMap<String, Boolean> getNotificationList() {
        return notificationList;
    }

}
