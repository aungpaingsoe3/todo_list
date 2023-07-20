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

    public ArrayList<User> getAllUsers(){
        return users;
    }

    public User getUser(String username, String password){
        for (User u: users){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
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

    public void addUser(String name, String username, String password){
        users.add(new User(name, username, password));
    }

    public void removeAllTask(User u){
        ArrayList<Task> tasks = getTask(u);
        for (Task t: tasks){
            if (t.isDone()){
                tasks.remove(t);
            }
        }
    }

    public void readUserFile(File userFile) throws IOException{
        try {
            FileReader fr = new FileReader(userFile);
            BufferedReader br = new BufferedReader(fr);
            boolean done = false;
            String nameInfo;
            while (!done) {
                nameInfo = br.readLine();
                if (nameInfo == null) {
                    done = true;
                }
                else {
                    String[] splitInfo = nameInfo.split(" | ");
                    addUser(splitInfo[0], splitInfo[1], splitInfo[2]);
                }
            }
            br.close();
            fr.close();
        }
        catch (FileNotFoundException x) {
            System.out.println("File is not found: " + userFile);
        }
    }

    public void writeUserFile(File userFile) throws IOException {
        FileWriter fw = new FileWriter(userFile);
        PrintWriter pw = new PrintWriter(fw);

        for (User u: users) {
            pw.printf(u.getUserInfo() + "\n");
        }

        pw.close();
        fw.close();
    }

    public void readTaskFile(File taskFile) throws IOException{
        try {
            FileReader fr = new FileReader(taskFile);
            BufferedReader br = new BufferedReader(fr);
            boolean done = false;
            String nameInfo;
            while (!done) {
                nameInfo = br.readLine();
                if (nameInfo == null) {
                    done = true;
                }
                else {
                    String[] splitInfo = nameInfo.split(" | ");
                    User existing = getUser(splitInfo[3], splitInfo[4]);
                    addTask(existing, new Task(splitInfo[0], splitInfo[1], Boolean.parseBoolean(splitInfo[2])));
                }
            }
            br.close();
            fr.close();
        }
        catch (FileNotFoundException x) {
            System.out.println("File is not found: " + taskFile);
        }
    }

    public void writeTaskFile(File taskFile) throws IOException {
        FileWriter fw = new FileWriter(taskFile);
        PrintWriter pw = new PrintWriter(fw);

        for (User u: users) {
            ArrayList<Task> allTasks = u.getTasks();
            for (Task t: allTasks){
                pw.printf("%s | %s | %b | %s | %s\n", t.getEventName(), t.getDue(), t.isDone(), u.getUsername(), u.getPassword());
            }
        }

        pw.close();
        fw.close();
    }

}
