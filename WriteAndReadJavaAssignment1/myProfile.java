import java.io.*;

public class myProfile{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
           String fileName="syakira.txt";
           try{
               FileWriter fileWriter= new FileWriter(fileName);
               BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
               bufferedWriter.write("NAME: NUR SYAKIRA BINTI AB HALIM");
               bufferedWriter.write("\n");
               bufferedWriter.write("MATRIX NO: 2014260246 \n");
               bufferedWriter.write("AGE: 24 \n");
               bufferedWriter.write("GENDER: FEMALE \n");
               bufferedWriter.write("E-MAILS: cahayasyakira09@gmail.com \n");
               bufferedWriter.write("MOBILE PHONE: 0136257730 \n");
               
               bufferedWriter.close();
            }
            catch(IOException ex){
                System.out.println("Error");
            }
        }  
}
