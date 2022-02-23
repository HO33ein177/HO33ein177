package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//sign in part

public class VisitorBackend{
    JFrame Frame = new JFrame();
    public VisitorBackend(){

        //        getinput class  is for getting input for Sign in part

        Frame.setBounds(600,250,500,500);
        Frame.setVisible(true);

        Container container = Frame.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.pink);

        JTextField Name_Text = new JTextField();
        Name_Text.setBounds(185,50,150,50);
        Font font = new Font("ARIAL", Font.PLAIN,15);
        Font font1 = new Font("ARIAL",Font.ITALIC,12);
        Name_Text.setFont(font);

        JTextField LastName_Text = new JTextField();
        LastName_Text.setBounds(185,110,150,50);
        LastName_Text.setFont(font);

        JTextField UserName_TextField = new JTextField();
        UserName_TextField.setBounds(185,170,150,50);
        UserName_TextField.setFont(font);


        JPasswordField PassWord_TextField = new JPasswordField();
        PassWord_TextField.setBounds(185,230,150,50);
        Font font2 = new Font("ARIAL",Font.BOLD,40);
        PassWord_TextField.setFont(font2);

        JLabel label4 = new JLabel("Enter your Name");
        label4.setBounds(60,50,150,50);
        label4.setFont(font1);

        JLabel label5 = new JLabel("Enter your LastName");
        label5.setBounds(60,110,150,50);
        label5.setFont(font1);

        JLabel label2 = new JLabel("Enter your UserName:");
        label2.setBounds(60,170,150,50);



        JLabel label3 = new JLabel("Enter your Password:");
        label3.setBounds(60,230,150,50);

        label2.setFont(font1);
        label2.setForeground(Color.BLACK);
        label3.setFont(font1);
        label3.setForeground(Color.BLACK);

        JButton button = new JButton("Continue");
        button.setBounds(185,290,150,50);

        JButton BackButton = new JButton("<-");
        BackButton.setBounds(0,0,50,40);

        Frame.add(Name_Text);
        Frame.add(LastName_Text);
        Frame.add(UserName_TextField);
        Frame.add(PassWord_TextField);
        Frame.add(label2);
        Frame.add(label3);
        Frame.add(label4);
        Frame.add(label5);
        Frame.add(button);
        Frame.add(BackButton);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Name = Name_Text.getText();
                    String LastName = LastName_Text.getText();
                    String UserName = UserName_TextField.getText();
                    int PassWord = Integer.parseInt(String.valueOf(PassWord_TextField.getPassword()));
                    String FileName = "VisitorData.txt";
                    WriteToFile writeToFile = new WriteToFile(Name,LastName,UserName,PassWord,FileName);
                    Frame.dispose();


                } catch (NumberFormatException ex) {
                    System.out.println("An error has occurred");
                    ex.printStackTrace();
                }

            }
        });

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.dispose();
                Visitor visitor = new Visitor();
            }
        });






    }




}
