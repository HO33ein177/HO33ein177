package Project;


import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

   public WriteToFile(String Name,String LastName,String UserName,int PassWord,String Filename){
      String password = Integer.toString(PassWord);
      try {
         FileWriter fileWriter = new FileWriter(Filename, true);
         fileWriter.write(Name+":");
         fileWriter.write(LastName+":");
         fileWriter.write(UserName+":");
         fileWriter.write(password+":\n");


         fileWriter.close();





      } catch (IOException e) {
         System.out.println("An error has occurred ");
         e.printStackTrace();
      }


   }





}
