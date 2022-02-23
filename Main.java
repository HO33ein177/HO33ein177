package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    JFrame Frame = new JFrame();
     Main(){

         //create a welcome GUI
        Frame.setBounds(600,250,500,500);

        Frame.setTitle("Welcome to Library's Book review");
        Container container = Frame.getContentPane();
        container.setLayout(null);

        container.setBackground(Color.PINK);
        Frame.setVisible(true);
//     Frame.setLayout(null);

        JLabel Label = new JLabel("Welcome");
        JLabel Label1 = new JLabel("Please choose one option to continue");

        Label.setBounds(200,20,100,100);
        Label1.setBounds(120,35,280,100);



        Font font = new Font("ARIAL",Font.ITALIC,20);
        Font font1 = new Font("ARIAL",Font.ITALIC,15);
        Label.setFont(font);
        Label1.setFont(font1);

        Frame.add(Label);
        Frame.add(Label1);
//        Frame.add(label);

//ask the Visitor that he is  a user or an admin

        JButton button_Admin = new JButton("Admin");
        button_Admin.setBounds(120,270,70,70);
        button_Admin.setBackground(Color.CYAN);
//     button.setFont(font1);
     ImageIcon Image = new ImageIcon("MainMenu_2.png");
        JLabel label = new JLabel(Image);
        label.setBounds(160,85,170,150);
        Frame.add(label);

        Frame.add(button_Admin);

        JButton button_Visitor = new JButton("Visitor");
        button_Visitor.setBounds(290,270,70,70);
        button_Visitor.setBackground(Color.MAGENTA);

        Frame.add(button_Visitor);


//create an object of user or admin based on Visitor choice
        button_Admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.dispose();
                Admin admin = new Admin();


            }
        });

        button_Visitor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                Frame.dispose();
                Visitor visitor = new Visitor();


            }
        });







    }




    public static void main(String[]args){
        Main main = new Main();
//        Visitor visitor = new Visitor();






    }




}

