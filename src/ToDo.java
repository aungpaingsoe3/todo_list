import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class ToDo {
    private ArrayList<User> users;
    private ArrayList<ChangeListener> listeners;


    public ToDo(){
        users = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    public void attach(ChangeListener l){
        listeners.add(l);
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public ArrayList<Task> getTask(User u){
        for (int i = 0; i < users.size(); i++) {
            User temp = users.get(i);
            if (u == temp){
                return temp.getTasks();
            }
        }
        return null;
    }

    public void addTask(User u, Task toAdd){
        u.getTasks().add(toAdd);
    }

    public void removeAllTask(User u){
        ArrayList<Task> tasks = getTask(u);
        for (Task t: tasks){
            if (t.isDone()){
                tasks.remove(t);
            }
        }
    }

}
