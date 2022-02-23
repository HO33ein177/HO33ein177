package Project;

import java.awt.*;
import javax.swing.*;






public class WorkVisitor {
    JFrame Frame ;
    //    JButton button ;
    JLabel label = new JLabel();
    TextArea textArea;

    //    JButton button1;
    JLabel label1 = new JLabel();
    TextArea textArea1;

    //    JButton button2 ;
    JLabel label2 = new JLabel();
    TextArea textArea2;

    //    JButton button3 ;
    JLabel label3 = new JLabel();
    TextArea textArea3;

    //    JButton button4 ;
    JLabel label4 = new JLabel();
    TextArea textArea4;

    //    JButton button5 ;
    JLabel label5 = new JLabel();
    TextArea textArea5;










    public static  int x = 50;
    public static  int y = 50;
    public static int width = 200;
    public static int height = 200;

    //    text area size
    public static int d = 50;
    public static int h = 255;
    public static int W = 200;
    public static int H = 65;

    public WorkVisitor(String FileName,int TextNumber) {


//        button = new JButton("Browse");
//        button.setBounds(x,y,width,height);
        Frame = new JFrame();
        label = new JLabel();
        label.setBounds(x, y, width, height);
        textArea = new TextArea();
        textArea.setBounds(d, h, W, H);

//        button1 = new JButton("Browse");
//        button1.setBounds(385,y,width,height);
//        label1 = new JLabel();
//        label1.setBounds(385,y,width,height);
        textArea1 = new TextArea();
        textArea1.setBounds(385, h, W, H);

//        button2 = new JButton("Browse");
//        button2.setBounds(720,y,width,height);
//        label2 = new JLabel();
//        label2.setBounds(720,y,width,height);
        textArea2 = new TextArea();
        textArea2.setBounds(720, h, W, H);


//        button3 = new JButton("Browse");
//        button3.setBounds(x,350,width,height);
//        label3 = new JLabel();
//        label3.setBounds(x,350,width,height);
        textArea3 = new TextArea();
        textArea3.setBounds(d, 560, W, H);

//        button4 = new JButton("Browse");
//        button4.setBounds(385,350,width,height);
//        label4 = new JLabel();
//        label4.setBounds(385,350,width,height);
        textArea4 = new TextArea();
        textArea4.setBounds(385, 560, W, H);

//        button5 = new JButton("Browse");
//        button5.setBounds(720,350,width,height);
//        label5 = new JLabel();
//        label5.setBounds(720,350,width,height);
        textArea5 = new TextArea();
        textArea5.setBounds(720, 560, W, H);

        JButton BackButton = new JButton("<-");
        BackButton.setBounds(0, 0, 50, 40);

        label = new JLabel();


//


//        Frame.add(BackButton);

        if (TextNumber == 1) {
            ImageIcon MyImage = new ImageIcon(FileName);
            Image img = MyImage.getImage();
            label = new JLabel(MyImage);
            label.setBounds(x, y, width, height);
            Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newImg);


        }
        if (TextNumber == 2) {
            ImageIcon MyImage = new ImageIcon(FileName);
            Image img = MyImage.getImage();
            label1 = new JLabel(MyImage);
            label1.setBounds(385, y, width, height);
            Image newImg = img.getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newImg);

        }
        if (TextNumber == 3) {
            ImageIcon MyImage = new ImageIcon(FileName);
            Image img = MyImage.getImage();
            label2 = new JLabel(MyImage);
            label2.setBounds(720, y, width, height);
            Image newImg = img.getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newImg);


        }
        if (TextNumber == 4) {
            ImageIcon MyImage = new ImageIcon(FileName);
            Image img = MyImage.getImage();
            label3 = new JLabel(MyImage);
            label3.setBounds(x, 350, width, height);
            Image newImg = img.getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newImg);


        }
        label4 = new JLabel();
        label4.setBounds(385, 350, width, height);
        if (TextNumber == 5) {
            ImageIcon MyImage = new ImageIcon(FileName);
            Image img = MyImage.getImage();
            label4 = new JLabel(MyImage);
//            Image newImg = img.getScaledInstance(label4.getWidth(), label4.getHeight(), Image.SCALE_SMOOTH);
//            ImageIcon image = new ImageIcon(newImg);

        }
        if (TextNumber == 6) {
            ImageIcon MyImage = new ImageIcon(FileName);
            Image img = MyImage.getImage();
            label5 = new JLabel(MyImage);
            label5.setBounds(720, 350, width, height);
            Image newImg = img.getScaledInstance(label5.getWidth(), label5.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newImg);

        }


        Frame.add(label);


        Frame.add(textArea);

//        add(button1);
        Frame.add(label1);
        Frame.add(textArea1);


//        add(button2);
        Frame.add(label2);
        Frame.add(textArea2);

//        add(button3);
        Frame.add(label3);
        Frame.add(textArea3);

//        add(button4);
        Frame.add(label4);
        Frame.add(textArea4);

//        add(button5);
        Frame.add(label5);
        Frame.add(textArea5);


        Frame.setLayout(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLocationRelativeTo(null);
        Frame.setBounds(300, 115, 1000, 680);
        Frame.setVisible(true);


//


    }
}