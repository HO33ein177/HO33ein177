package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminAction {

    JFrame Frame;
    JButton Button_Images;
    JButton ButtonAddImages;
    JLabel Welcome;
    static int n = 0;
    public AdminAction(){
        Frame = new JFrame();
        Frame.setTitle("What do you want to do?");
        Frame.setBounds(600,250,500,500);

        Container container = Frame.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.BLUE);
        Font font = new Font("ARIAL",Font.ITALIC,12);

        Button_Images = new JButton("See Reviews ");
        Button_Images.setFont(font);
        Button_Images.setBounds(160,100,150,50);
        Button_Images.setBackground(Color.orange);
        Button_Images.setForeground(Color.blue);

        ButtonAddImages = new JButton("Add Image");
        ButtonAddImages.setFont(font);
        ButtonAddImages.setBounds(160,200,150,50);
        ButtonAddImages.setBackground(Color.RED);
        ButtonAddImages.setForeground(Color.GREEN);

        JButton BackButton = new JButton("<-");
        BackButton.setBounds(0,0,50,40);

        Font font1 = new Font("ARIAL",Font.ITALIC,20);
        Welcome = new JLabel("Choose one action to continue");
        Welcome.setFont(font1);
        Welcome.setBounds(100,30,300,50);
        Welcome.setForeground(Color.PINK);



        Frame.add(Button_Images);
        Frame.setVisible(true);
        Frame.add(ButtonAddImages);
        Frame.add(Welcome);
        Frame.add(BackButton);

        Button_Images.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Work work1 = new Work();

            }

        });



        ButtonAddImages.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Work work = new Work();

            }
        });

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.dispose();

            }
        });













    }







}
