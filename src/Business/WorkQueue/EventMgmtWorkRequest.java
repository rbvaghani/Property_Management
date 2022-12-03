/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Utility.Event;

/**
 *
 * @author mansi
 */
public class EventMgmtWorkRequest  extends WorkRequest{
    
    private Event events;

    public Event getEvents() {
        return events;
    }

    public void setEvents(Event events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return events.getEventName();
    }
    
    
    
}
