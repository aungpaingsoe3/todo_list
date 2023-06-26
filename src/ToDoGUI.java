import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.event.*;

public class ToDoGUI {
    public ToDoGUI(){
        JFrame testFrame = new JFrame();
        testFrame.setSize(200,200);
        JButton testButton = new JButton("Click here");
        testButton.setSize(50,50);
        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                testFrame.dispose();
                JFrame newFrame = new JFrame();
                newFrame.setSize(200,200);
                JTextField aField = new JTextField("6/25/2023 - SUNDAY");
                aField.setEditable(false);
                newFrame.add(aField);
                newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newFrame.pack();
                newFrame.setVisible(true);
            }
        });
        testFrame.setLayout(new BorderLayout());
        testFrame.add(testButton, BorderLayout.CENTER);
        testFrame.pack();
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setVisible(true);
    }
}
