package entities;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Event> eventQueue = new ArrayList<>();
    public final static int MAX_QUEUE_SIZE = 100;

    public Queue(List<Event> eventQueue) {
        this.eventQueue = eventQueue;
    }

    public List<Event> getEventQueue() {
        return eventQueue;
    }

    public void setEventQueue(List<Event> eventQueue) {
        this.eventQueue = eventQueue;
    }
}
