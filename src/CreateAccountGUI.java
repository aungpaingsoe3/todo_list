import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.border.Border;
import javax.swing.event.*;
public class CreateAccountGUI extends JFrame {
    public static int FRAME_WIDTH = 650;
    public static int FRAME_HEIGHT = 250;

    public CreateAccountGUI() {
        setTitle("To-Do List");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Header text
        JPanel headerText = new JPanel();
        JLabel space = new JLabel("          ");
        JLabel direction = new JLabel("Please enter the following information to create an account.");
        Font dirFont = new Font("SansSerif", Font.BOLD, 18);
        direction.setFont(dirFont);
        direction.setBackground(Color.LIGHT_GRAY);
        headerText.setLayout(new BorderLayout());
        headerText.add(direction, BorderLayout.NORTH);
        headerText.add(space, BorderLayout.CENTER);
        headerText.setBackground(Color.LIGHT_GRAY);

        // Name field
        JPanel input = new JPanel();
        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBackground(Color.LIGHT_GRAY);
        JTextField name = new JTextField();
        name.setBackground(Color.WHITE);
        name.setPreferredSize(new Dimension(250, 30));
        namePanel.setLayout(new FlowLayout());
        namePanel.add(nameLabel);
        namePanel.add(Box.createHorizontalStrut(40));
        namePanel.add(name);
        namePanel.setBackground(Color.LIGHT_GRAY);

        // Username field
        JPanel usernamePanel = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBackground(Color.LIGHT_GRAY);
        JTextField username = new JTextField();
        username.setBackground(Color.WHITE);
        username.setPreferredSize(new Dimension(250, 30));
        usernamePanel.setLayout(new FlowLayout());
        usernamePanel.add(usernameLabel);
        usernamePanel.add(Box.createHorizontalStrut(15));
        usernamePanel.add(username);
        usernamePanel.setBackground(Color.LIGHT_GRAY);

        // Password field
        JPanel passwordPanel = new JPanel();
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBackground(Color.LIGHT_GRAY);
        JPasswordField password = new JPasswordField();
        password.setBackground(Color.WHITE);
        password.setPreferredSize(new Dimension(250, 30));
        passwordPanel.setLayout(new FlowLayout());
        passwordPanel.add(passwordLabel);
        passwordPanel.add(Box.createHorizontalStrut(17));
        passwordPanel.add(password);
        passwordPanel.setBackground(Color.LIGHT_GRAY);

        // Combines Username and Password field
        JPanel uAndP = new JPanel();
        uAndP.setLayout(new BorderLayout());
        uAndP.add(usernamePanel, BorderLayout.NORTH);
        uAndP.add(passwordPanel, BorderLayout.CENTER);

        input.setLayout(new BorderLayout());
        input.add(namePanel, BorderLayout.NORTH);
        input.add(uAndP, BorderLayout.CENTER);
        input.setBackground(Color.LIGHT_GRAY);

        // Create Account button
        JButton createAcc = new JButton("CREATE ACCOUNT");
        Font button = new Font("SansSerif", Font.PLAIN, 14);
        createAcc.setFont(button);
        createAcc.setPreferredSize(new Dimension(100, 50));
        input.add(createAcc, BorderLayout.SOUTH);

        setLayout(new BorderLayout());
        add(headerText, BorderLayout.NORTH);
        add(input, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
