package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DesktopUI extends JFrame implements ActionListener{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;



    public DesktopUI() {
        setTitle("User Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        add(panel);
        setVisible(true);

}
    public  void actionPerformed(ActionEvent e) {


        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        Selenium selenium=new Selenium();
         selenium.test(username,password);

    }


}