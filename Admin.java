package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin {
    JFrame Frame = new JFrame("");
    public Admin(){
        Frame.setBounds(600,250,500,500);
        Frame.setTitle("Welcome to Admin's page");
        Frame.setVisible(true);
        Container container = Frame.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.ORANGE);

        ImageIcon icon = new ImageIcon("Admin_1.png");
        JLabel Label = new JLabel(icon);
        Label.setBounds(160,50,170,150);
        Frame.add(Label);

        JLabel label = new JLabel("Already have an account?");
        JLabel label1 = new JLabel("New to online Library?");

        label.setBounds(80,220,200,100);
        label.setForeground(Color.BLACK);
        label1.setBounds(80,280,200,100);
        label1.setForeground(Color.BLACK);

        Font font = new Font("ARIAL",Font.ITALIC,15);



        label.setFont(font);
        label1.setFont(font);

        JButton button_Login = new JButton("Log in");
        button_Login.setBounds(330,245,100,50);
        button_Login.setBackground(Color.BLUE);
        button_Login.setForeground(Color.BLACK);

        JButton button_Sign_in = new JButton("Sign in");
        button_Sign_in.setBounds(330,305,100,50);
        button_Sign_in.setBackground(Color.BLUE);
        button_Sign_in.setForeground(Color.BLACK);

        JButton BackButton = new JButton("<-");
        BackButton.setBounds(0,0,50,40);


        Frame.add(label);
        Frame.add(label1);
        Frame.add(button_Login);
        Frame.add(button_Sign_in);
        Frame.add(BackButton);
        button_Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.dispose();
                GetInput Input = new GetInput();

            }
        });

        button_Sign_in.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.dispose();
                GetInput_2 getInput_2 = new GetInput_2();



            }
        });

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.dispose();
                Main main = new Main();
            }
        });









    }
//admin can put new book's image for reviews on GUI
//admin can see all the reviews





}
