import java.io.*;
import java.util.*;

public class ToDoTester {
    public static void main(String[] args) throws IOException {
        ToDo todo = new ToDo();
        File users = new File("users");
        File tasks = new File("tasks");
        if (users.exists()){
            todo.readUserFile(users);
        }
        if (tasks.exists()){
            todo.readTaskFile(tasks);
        }
        ToDoGUI toDoGui = new ToDoGUI(todo);

//        OpenerGUI openerGui = new OpenerGUI();
//        SignInGUI signin = new SignInGUI();
//        CreateAccountGUI createAcc = new CreateAccountGUI();
//        AddGUI add = new AddGUI();
    }
}