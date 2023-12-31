import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.border.Border;
import javax.swing.event.*;
public class OpenerGUI extends JFrame{
    public static int FRAME_WIDTH = 650;
    public static int FRAME_HEIGHT = 170;
    private CreateAccountGUI newAcc;
    private SignInGUI login;
    private ToDo todo;
    public OpenerGUI(ToDo td){
        todo = td;
        setTitle("To-Do List");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Header texts
        JPanel textPanels = new JPanel();
        JPanel headerPanel = new JPanel();
        JLabel space = new JLabel("          ", JLabel.CENTER);
        JLabel header = new JLabel("Welcome to the To-Do List App!", JLabel.CENTER);
        Font headerFont = new Font("SansSerif", Font.BOLD, 30);
        header.setFont(headerFont);
        space.setSize(150,150);
        headerPanel.setLayout(new BorderLayout());
        headerPanel.add(space, BorderLayout.SOUTH);
        headerPanel.add(header, BorderLayout.NORTH);
        headerPanel.setBackground(Color.LIGHT_GRAY);

        // Options Direction texts
        JPanel optionsPanel = new JPanel();
        JLabel space2 = new JLabel("          ", JLabel.LEFT);
        JLabel options = new JLabel("Please choose one of the options below to continue.", JLabel.LEFT);
        Font optionFont = new Font("SansSerif", Font.BOLD, 18);
        options.setFont(optionFont);
        optionsPanel.setLayout(new BorderLayout());
        optionsPanel.add(space2, BorderLayout.SOUTH);
        optionsPanel.add(options, BorderLayout.NORTH);
        optionsPanel.setBackground(Color.LIGHT_GRAY);

        textPanels.setLayout(new BorderLayout());
        textPanels.add(headerPanel, BorderLayout.NORTH);
        textPanels.add(optionsPanel, BorderLayout.WEST);
        textPanels.setBackground(Color.LIGHT_GRAY);

        // Sign-in button
        Font button = new Font("SansSerif", Font.PLAIN, 14);
        JButton signIn = new JButton("SIGN IN");
        signIn.setPreferredSize(new Dimension(100,50));
        signIn.setFont(button);
        signIn.addActionListener(e -> {
            this.dispose();
            login = new SignInGUI(todo);
        });

        // Create Account button
        JButton createAcc = new JButton("CREATE ACCOUNT");
        createAcc.setPreferredSize(new Dimension(150,50));
        createAcc.setFont(button);
        createAcc.addActionListener(e -> {
            this.dispose();
            newAcc = new CreateAccountGUI(todo);
        });

        // Panel of buttons
        JPanel buttons = new JPanel();
        buttons.setPreferredSize(new Dimension(200,50));
        buttons.setLayout(new FlowLayout());
        buttons.add(signIn);
        buttons.add(Box.createHorizontalStrut(65));
        buttons.add(createAcc);
        buttons.setBackground(Color.LIGHT_GRAY);

        setLayout(new BorderLayout());
        add(textPanels, BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}