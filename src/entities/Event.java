package entities;

public class Event {

    private long timeCreation = 0;

    public Event(long timeCreation) {
        this.timeCreation = timeCreation;
    }

    public long getTimeCreation() {
        return timeCreation;
    }

    public void setTimeCreation(long timeCreation) {
        this.timeCreation = timeCreation;
    }
}
