package Project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

    public ReadFile(String UserName,int PassWord,String FileName){
        boolean login = false;


        try {
            FileReader File = new FileReader(FileName);
            Scanner scanner = new Scanner(File);
            String str;
            String Pass;
            while(scanner.hasNextLine()){
                str = scanner.nextLine();
                if(str.contains(UserName) && str.contains(String.valueOf(PassWord))){
                        System.out.println("Welcome back "+UserName);
                        login = true;
                        System.out.println("\n");
                        break;
                }


                }






        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (login){
            AdminAction adminAction = new AdminAction();


        }
        else System.out.println("Your username or password is incorrect");





    }






}
