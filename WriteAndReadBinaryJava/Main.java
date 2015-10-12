import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        
        Profile nursyakira = new Profile();
        nursyakira.name="NUR SYAKIRA BINTI AB HALIM";
        nursyakira.matrix_no=2014260246;
        nursyakira.gender="FEMALE";
        nursyakira.age=24;
        nursyakira.emails="cahayasyakira09@gmail.com";
        nursyakira.mobile_phone=0136257730;
        
        String filename = "nursyakira.bin";
        
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(nursyakira);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace();
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        System.out.println("----Done----");
         
        System.out.println("-----Start Reading Binary File-----");
        try {
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            Profile p = (Profile) ois.readObject();
            System.out.println("Name = "+p.name);
            System.out.println("Matrix No = "+p.matrix_no);
            System.out.println("Gender = "+p.gender);
            System.out.println("Age = "+p.age);
            System.out.println("Email = "+p.emails);
            System.out.println("Mobile No = "+p.mobile_phone);
            ois.close();
            
            
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace();
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }

    }
    
}