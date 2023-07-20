import java.util.*;
public class User {
    private String name;
    private String username;
    private String password;
    private ArrayList<Task> tasks;

    public User(String n, String u, String p){
        name = n;
        username = u;
        password = p;
        tasks = new ArrayList<Task>();
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public boolean checkUsername(String usernameToCheck) {
        return usernameToCheck.equals(username);
    }

    public boolean checkPassword(String passwordToCheck) {
        return passwordToCheck.equals(password);
    }

    public String getUserInfo(){
        return name + " | " + username + " | " + password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        User toCheck = (User) obj;
        if ((this.name == toCheck.name) && (this.username == toCheck.username) && (this.password == toCheck.password)) {
           return true;
        }
        return false;
    }

}
