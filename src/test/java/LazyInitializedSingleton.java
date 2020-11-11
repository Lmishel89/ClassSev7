import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance=null;
    private LazyInitializedSingleton(){}
    public static LazyInitializedSingleton getInstance(){
        if(instance==null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
     public void writeToFile(String txt) throws IOException {
         System.out.println("Enter your name");
         Scanner s = new Scanner(System.in);
         String string = s.next();
         System.out.println("Enter your age");
         Long age = s.nextLong();
         System.out.println("Enter your address");
         String address = s.next();
         System.out.println("Enter your phone number");
         Long phone = s.nextLong();

        File logfile = new File(txt);
        BufferedWriter writer = new BufferedWriter(new FileWriter(logfile));
        writer.write(string);
        writer.newLine();
        writer.write(String.valueOf(age));
        writer.newLine();
        writer.write(address);
        writer.newLine();
        writer.write(String.valueOf(phone));
        writer.close();
     }
 }
