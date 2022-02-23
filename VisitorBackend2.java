package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// login part

public class VisitorBackend2 {
    JFrame Frame = new JFrame();
    public VisitorBackend2(){
//        getinput class  is for getting input for login part

        Frame.setBounds(600,250,500,500);
        Frame.setVisible(true);

        Container container = Frame.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.GREEN);

        JTextField UserName_TextField = new JTextField();
        UserName_TextField.setBounds(185,50,150,50);
        Font font = new Font("ARIAL", Font.PLAIN,15);
        UserName_TextField.setFont(font);

        JPasswordField PassWord_TextField = new JPasswordField();
        PassWord_TextField.setBounds(185,150,150,50);
        Font font2 = new Font("ARIAL",Font.BOLD,40);
        PassWord_TextField.setFont(font2);

        JLabel label2 = new JLabel("Enter your UserName:");
        label2.setBounds(60,50,150,50);
        Font font1 = new Font("ARIAL",Font.ITALIC,12);


        JLabel label3 = new JLabel("Enter your Password:");
        label3.setBounds(60,150,150,50);

        label2.setFont(font1);
        label2.setForeground(Color.BLACK);
        label3.setFont(font1);
        label3.setForeground(Color.BLACK);

        JButton button = new JButton("Continue");
        button.setBounds(185,230,150,50);

        JButton BackButton = new JButton("<-");
        BackButton.setBounds(0,0,50,40);

        Frame.add(UserName_TextField);
        Frame.add(PassWord_TextField);
        Frame.add(label2);
        Frame.add(label3);
        Frame.add(button);
        Frame.add(BackButton);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String UserName = UserName_TextField.getText();
                    int PassWord = Integer.parseInt(String.valueOf(PassWord_TextField.getPassword()));
                    String FileName = "VisitorData.txt";
                    ReadFile readFile = new ReadFile(UserName,PassWord,FileName);

                } catch (HeadlessException ex) {
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
