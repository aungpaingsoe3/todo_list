import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.border.Border;
import javax.swing.event.*;
public class SignInGUI extends JFrame{

    public static int FRAME_WIDTH = 650;
    public static int FRAME_HEIGHT = 250;
    public SignInGUI(){
        setTitle("To-Do List");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        JPanel text = new JPanel();
        JLabel space = new JLabel("          ");
        JLabel direction = new JLabel("Please enter your username and your password below to continue.");
        Font dirFont = new Font("SansSerif", Font.BOLD, 18);
        direction.setFont(dirFont);
        direction.setBackground(Color.LIGHT_GRAY);
        text.setLayout(new BorderLayout());
        text.add(direction, BorderLayout.NORTH);
        text.add(space, BorderLayout.CENTER);
        text.setBackground(Color.LIGHT_GRAY);

        JPanel inputPanel = new JPanel();
        JPanel usernamePanel = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBackground(Color.LIGHT_GRAY);
        JTextField username = new JTextField();
        username.setPreferredSize(new Dimension(250, 30));
        usernamePanel.setLayout(new FlowLayout());
        usernamePanel.add(usernameLabel);
        usernamePanel.add(Box.createHorizontalStrut(20));
        usernamePanel.add(username);
        usernamePanel.setBackground(Color.LIGHT_GRAY);

        JPanel passwordPanel = new JPanel();
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBackground(Color.LIGHT_GRAY);
        JPasswordField password = new JPasswordField();
        password.setPreferredSize(new Dimension(250, 30));
        passwordPanel.setLayout(new FlowLayout());
        passwordPanel.add(passwordLabel);
        passwordPanel.add(Box.createHorizontalStrut(20));
        passwordPanel.add(password);
        passwordPanel.setBackground(Color.LIGHT_GRAY);

        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(usernamePanel, BorderLayout.NORTH);
        inputPanel.add(passwordPanel, BorderLayout.CENTER);
        inputPanel.setBackground(Color.LIGHT_GRAY);

        JButton signIn = new JButton("SIGN IN");
        Font button = new Font("SansSerif", Font.PLAIN, 14);
        signIn.setFont(button);
        signIn.setPreferredSize(new Dimension(100, 50));
        inputPanel.add(signIn, BorderLayout.SOUTH);

        setLayout(new BorderLayout());
        add(text, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
