package Project;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Work extends JFrame{
    JButton button ;
    JButton button_1;
    JLabel label;
    TextArea textArea;

    JButton button1;
    JButton button_2;
    JLabel label1;
    TextArea textArea1;

    JButton button2 ;
    JButton button_3;
    JLabel label2;
    TextArea textArea2;

    JButton button3 ;
    JButton button_4;
    JLabel label3;
    TextArea textArea3;

    JButton button4 ;
    JButton button_5;
    JLabel label4;
    TextArea textArea4;

    JButton button5 ;
    JButton button_6;
    JLabel label5;
    TextArea textArea5;

    JRadioButton radioButton1;
    JRadioButton radioButton2;
    ButtonGroup buttonGroup;

       public void WriteToFile(String Text){
           FileWriter fileWriter;
           try {
                fileWriter = new FileWriter("SavedData.txt",true);
                fileWriter.write(Text+"\n");

                fileWriter.close();


           } catch (IOException e) {
               e.printStackTrace();
           }

       }
       public void WriteFileName(String FileName){
           FileWriter file;
           try{
               file = new FileWriter("FileNames.txt",true);
               file.write(FileName+"\n");

               file.close();

           }


           catch (IOException e) {
               e.printStackTrace();
           }
       }





    Container container;
    public static  int x = 50;
    public static  int y = 50;
    public static int width = 200;
    public static int height = 200;

    //    text area size
    public static int d = 50;
    public static int h = 255;
    public static int W = 200;
    public static int H = 65;

    public Work(){
        super("");
        button = new JButton("Browse");
        button.setBounds(x,y,width,height);
        label = new JLabel();
        label.setBounds(x,y,width,height);
        textArea = new TextArea();
        textArea.setBounds(d,h,W,H);

        button1 = new JButton("Browse");
        button1.setBounds(385,y,width,height);
        label1 = new JLabel();
        label1.setBounds(385,y,width,height);
        textArea1 = new TextArea();
        textArea1.setBounds(385,h,W,H);

        button2 = new JButton("Browse");
        button2.setBounds(720,y,width,height);
        label2 = new JLabel();
        label2.setBounds(720,y,width,height);
        textArea2 = new TextArea();
        textArea2.setBounds(720,h,W,H);


        button3 = new JButton("Browse");
        button3.setBounds(x,350,width,height);
        label3 = new JLabel();
        label3.setBounds(x,350,width,height);
        textArea3 = new TextArea();
        textArea3.setBounds(d,560,W,H);

        button4 = new JButton("Browse");
        button4.setBounds(385,350,width,height);
        label4 = new JLabel();
        label4.setBounds(385,350,width,height);
        textArea4 = new TextArea();
        textArea4.setBounds(385,560,W,H);

        button5 = new JButton("Browse");
        button5.setBounds(720,350,width,height);
        label5 = new JLabel();
        label5.setBounds(720,350,width,height);
        textArea5 = new TextArea();
        textArea5.setBounds(720,560,W,H);

        JButton BackButton = new JButton("<-");
        BackButton.setBounds(0,0,50,40);

        radioButton1 = new JRadioButton("Yes");
        radioButton2 = new JRadioButton("No");
        buttonGroup = new ButtonGroup();

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        button_1 = new JButton("Submit");
        button_1.setBounds(70,465,15,10);

        button_2 = new JButton("Submit");

        button_3 = new JButton("Submit");

        button_4 = new JButton("Submit");

        button_5 = new JButton("Submit");

        button_6 = new JButton("Submit");





        add(button);
        add(label);
        add(textArea);

        add(button1);
        add(label1);
        add(textArea1);

        add(button2);
        add(label2);
        add(textArea2);

        add(button3);
        add(label3);
        add(textArea3);

        add(button4);
        add(label4);
        add(textArea4);

        add(button5);
        add(label5);
        add(textArea5);

        add(BackButton);

        add(radioButton1);
        add(radioButton2);

        add(button_1);




        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WriteToFile("TextArea:");
                WriteToFile(textArea.getText());

                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                //filter the files
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                //if the user click on save in Jfilechooser
                if(result == JFileChooser.APPROVE_OPTION){
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    WriteFileName(path);
                    label.setIcon(ResizeImage(path));
                    remove(button);
                }
                //if the user click on save in Jfilechooser


                else if(result == JFileChooser.CANCEL_OPTION){
                    System.out.println("No File Select");
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WriteToFile("TextArea1:");
                WriteToFile(textArea1.getText());
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                //filter the files
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                //if the user click on save in Jfilechooser
                if(result == JFileChooser.APPROVE_OPTION){
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    WriteFileName(path);
                    label1.setIcon(ResizeImage(path));
                    remove(button1);
                }
                //if the user click on save in Jfilechooser


                else if(result == JFileChooser.CANCEL_OPTION){
                    System.out.println("No File Select");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WriteToFile("TextArea2:");
                WriteToFile(textArea2.getText());
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                //filter the files
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                //if the user click on save in Jfilechooser
                if(result == JFileChooser.APPROVE_OPTION){
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    WriteFileName(path);
                    label2.setIcon(ResizeImage(path));
                    remove(button2);
                }
                //if the user click on save in Jfilechooser


                else if(result == JFileChooser.CANCEL_OPTION){
                    System.out.println("No File Select");
                }
            }

        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WriteToFile("TextArea3:");
                WriteToFile(textArea3.getText());
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                //filter the files
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                //if the user click on save in Jfilechooser
                if(result == JFileChooser.APPROVE_OPTION){
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    WriteFileName(path);
                    label3.setIcon(ResizeImage(path));
                    remove(button3);
                }
                //if the user click on save in Jfilechooser


                else if(result == JFileChooser.CANCEL_OPTION){
                    System.out.println("No File Select");
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WriteToFile("TextArea4:");
                WriteToFile(textArea4.getText());
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                //filter the files
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                //if the user click on save in Jfilechooser
                if(result == JFileChooser.APPROVE_OPTION){
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    WriteFileName(path);
                    label4.setIcon(ResizeImage(path));
                    remove(button4);
                }
                //if the user click on save in Jfilechooser


                else if(result == JFileChooser.CANCEL_OPTION){
                    System.out.println("No File Select");
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WriteToFile("TextArea5:");
                WriteToFile(textArea5.getText());
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                //filter the files
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                //if the user click on save in Jfilechooser
                if(result == JFileChooser.APPROVE_OPTION){
                    File selectedFile = file.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    WriteFileName(path);
                    label5.setIcon(ResizeImage(path));
                    remove(button5);
                }
                //if the user click on save in Jfilechooser


                else if(result == JFileChooser.CANCEL_OPTION){
                    System.out.println("No File Select");
                }
            }
        });


        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });




        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(300,115,1000,680);
        setVisible(true);
    }

    // Methode to resize imageIcon with the same size of a Jlabel
    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }




}