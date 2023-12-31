public class Task {
    private String eventName;
    private String due;
    private boolean done;

    public Task(String name, String d){
        eventName = name;
        due = d;
        done = false;
    }

    public Task(String name, String date, boolean d){
        eventName = name;
        due = date;
        done = d;
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

    public void setDone(){
        if (!done){
            done = true;
        }
        else {
            done = false;
        }
    }
}
