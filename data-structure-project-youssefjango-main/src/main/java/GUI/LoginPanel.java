/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import constants.CommonConstants;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * This panel is used to protect the information access.(Mostly used to learn more about GUI principles)
 * @author Youssef
 */
public class LoginPanel extends JFrame {

    public LoginPanel() {
        super(CommonConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(CommonConstants.FRAME_SIZE[0], CommonConstants.FRAME_SIZE[1]);
        addGUIComponents();

    }

    public void addGUIComponents() {
        SpringLayout sprintLayout = new SpringLayout();
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(sprintLayout);

        //Username
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 18));

        JTextField usernameField = new JTextField(CommonConstants.TEXTFIELD_SIZE);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 18));

        sprintLayout.putConstraint(SpringLayout.WEST, usernameLabel, 35, SpringLayout.WEST, loginPanel);
        sprintLayout.putConstraint(SpringLayout.NORTH, usernameLabel, 85, SpringLayout.NORTH, loginPanel);
        sprintLayout.putConstraint(SpringLayout.WEST, usernameField, 135, SpringLayout.WEST, loginPanel);
        sprintLayout.putConstraint(SpringLayout.NORTH, usernameField, 85, SpringLayout.NORTH, loginPanel);

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        // password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
        JPasswordField passwordField = new JPasswordField(CommonConstants.TEXTFIELD_SIZE);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));

        sprintLayout.putConstraint(SpringLayout.WEST, passwordLabel, 35, SpringLayout.WEST, loginPanel);
        sprintLayout.putConstraint(SpringLayout.NORTH, passwordLabel, 135, SpringLayout.NORTH, loginPanel);
        sprintLayout.putConstraint(SpringLayout.WEST, passwordField, 135, SpringLayout.WEST, loginPanel);
        sprintLayout.putConstraint(SpringLayout.NORTH, passwordField, 135, SpringLayout.NORTH, loginPanel);

        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);

        //Login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Dialog", Font.BOLD, 18));
        sprintLayout.putConstraint(SpringLayout.WEST, loginButton, 150, SpringLayout.WEST, loginPanel);
        sprintLayout.putConstraint(SpringLayout.NORTH, loginButton, 250, SpringLayout.NORTH, loginPanel);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();
                if (username.trim().equals("Adin Ashby") && password.equals("BestTeacher123")) {
                    JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!");
                    JComponent comp = (JComponent) e.getSource();
                    Window win = SwingUtilities.getWindowAncestor(comp);
                    win.dispose();
                    new DepSelection().setVisible(true);
                } else if (!username.equals("Adin Ashby")) {
                    passwordField.setText("");
                    usernameField.setText("");
                    JOptionPane.showMessageDialog(null, "Wrong username or password");
                } else if (username.equals("Adin Ashby") && !password.equals("Adin Ashby")) {
                    passwordField.setText("");
                    JOptionPane.showMessageDialog(null, "Wrong password");
                }

            }
        });

        loginPanel.add(loginButton);
        this.getContentPane().add(loginPanel);

    }

    /*public static void main(String[] args) {
        JFrame frame = new JFrame("School Departement Manager - Made by Youssef Ben Mouny");
        frame.setBackground(Color.red);
        frame.setBackground(Color.red);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        JButton button = new JButton("Login");
        button.setForeground(Color.blue);
        button.setSize(1, 2);

        frame.getContentPane().add(button); // Adds Button to content pane of frame

        frame.setVisible(true);
    }*/
}
