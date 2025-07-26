package org.example;

public class OrderEvent {

    public enum EventType {
        NEW, VERIFIED, SHIPPED, DELIVERED
    }

    private String id;
    private EventType eventType;
    private boolean isValid;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public boolean isValid() {
        return isValid;
    }

    @Override
    public String toString() {
        return "OrderEvent{" +
                "id='" + id + '\'' +
                ", eventType=" + eventType +
                ", isValid=" + isValid +
                '}';
    }
}
