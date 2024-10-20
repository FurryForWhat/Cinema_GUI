package com.example.custom;

import com.example.custom.HomePage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow {
    private JFrame frame;
    private JTextField userField;
    private JPasswordField passField;
    private JLabel userLabel;
    private JLabel passLabel;
    private JButton loginBtn;
    private JButton exitBtn;

    public LoginWindow(){

        initialization();
        setUpFrame();
        LoginBtnAction();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private void setUpFrame(){
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(350,200);
        this.frame.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10,10,10,10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(this.userLabel,constraints);
        constraints.gridx = 1;
        frame.add(this.userField,constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        frame.add(this.passLabel,constraints);
        constraints.gridx = 1;
        frame.add(this.passField,constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        frame.add(this.loginBtn,constraints);
        constraints.gridx = 1;
        frame.add(this.exitBtn,constraints);


    }
    private void initialization(){
        this.frame = new JFrame("User Login");
        this.userLabel = new JLabel("Username");
        this.passLabel = new JLabel("Password");
        this.userField = new JTextField(15);
        this.passField = new JPasswordField(15);
        this.loginBtn = new JButton("Login");
        this.exitBtn = new JButton("Exit");
    }
    private void LoginBtnAction(){
        this.loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = userField.getText();
                String password = new String(passField.getPassword());

                if(name.equals("root") && password.equals("root")){
                    HomePage hp = new HomePage();
                    frame.dispose();
                }else{
                    JOptionPane.showMessageDialog(frame,"Something Wrong, Try again❌❌🥺","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
