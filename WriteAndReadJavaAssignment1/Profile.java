
import java.io.*;

public class Profile
{
 public static void main (String [] args) {
 String fileName = "syakira.txt";
 String line = null;
 try {
     FileReader fileReader = new FileReader (fileName);
     BufferedReader bufferedReader = new BufferedReader (fileReader);
     while((line=bufferedReader.readLine()) !=null) {
         System.out.println(line);
        }
        bufferedReader.close();
    }
    catch(FileNotFoundException ex) {
        System.out.println("Unable to open File'" + fileName + "'");
    }
    catch(IOException ex) {
        System.out.println("Error reading Fiel'" + fileName + "'"); 
    }        
 }
}
  
