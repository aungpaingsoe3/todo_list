import java.time.*;
import java.util.*;


public class EventsToDo {
    private String eventName;
    private String due;
    private boolean done;

    public EventsToDo (String name, String d){
        eventName = name;
        due = d;
        done = false;
    }

    public String getEventName(){
        return eventName;
    }

    public boolean isDone() {
        return done;
    }

    public String getDue() {
        return due;
    }
}
