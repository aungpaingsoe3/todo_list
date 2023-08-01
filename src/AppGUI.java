import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.event.*;

public class AppGUI extends JFrame{
    public static int FRAME_WIDTH = 600;
    public static int FRAME_HEIGHT = 700;
    private ToDo todo;

    public AppGUI(ToDo td){
        todo = td;
        setTitle("To-Do List");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


}
