import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.event.*;
public class AddGUI extends JFrame {
    public static int FRAME_WIDTH = 800;
    public static int FRAME_HEIGHT = 200;

    public AddGUI(){
        setTitle("To-Do List");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        JPanel headerText = new JPanel();
        JLabel space = new JLabel("          ");
        JLabel direction = new JLabel("Please enter the following information and then click on save to add to the to-do list.");
        Font dirFont = new Font("SansSerif", Font.BOLD, 17);
        direction.setFont(dirFont);
        direction.setBackground(Color.LIGHT_GRAY);
        headerText.setLayout(new BorderLayout());
        headerText.add(direction, BorderLayout.NORTH);
        headerText.add(space, BorderLayout.CENTER);
        headerText.setBackground(Color.LIGHT_GRAY);

        // Task Name field
        JPanel input = new JPanel();
        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("Task/Event Name: ");
        nameLabel.setBackground(Color.LIGHT_GRAY);
        JTextField name = new JTextField();
        name.setBackground(Color.WHITE);
        name.setPreferredSize(new Dimension(250, 30));
        namePanel.setLayout(new FlowLayout());
        namePanel.add(nameLabel);
        namePanel.add(Box.createHorizontalStrut(40));
        namePanel.add(name);
        namePanel.setBackground(Color.LIGHT_GRAY);

        // Date Field
        JPanel datePanel = new JPanel();
        JLabel dateLabel = new JLabel("Date (in MM/DD/YY): ");
        dateLabel.setBackground(Color.LIGHT_GRAY);
        JTextField date = new JTextField();
        date.setBackground(Color.WHITE);
        date.setPreferredSize(new Dimension(250, 30));
        datePanel.setLayout(new FlowLayout());
        datePanel.add(dateLabel);
        datePanel.add(Box.createHorizontalStrut(20));
        datePanel.add(date);
        datePanel.setBackground(Color.LIGHT_GRAY);

        input.setLayout(new BorderLayout());
        input.add(namePanel, BorderLayout.NORTH);
        input.add(datePanel, BorderLayout.CENTER);
        input.setBackground(Color.LIGHT_GRAY);

        // Save button
        JButton save = new JButton("SAVE");
        Font button = new Font("SansSerif", Font.PLAIN, 14);
        save.setFont(button);
        save.setPreferredSize(new Dimension(100, 50));
        input.add(save, BorderLayout.SOUTH);

        setLayout(new BorderLayout());
        add(headerText, BorderLayout.NORTH);
        add(input, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
