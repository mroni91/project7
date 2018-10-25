package fileoperation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.management.BufferPoolMXBean;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String path = "/Users/mohammedroni/Documents/myname.txt";
        try{
            fr = new FileReader(path);
        }catch(Exception ex){
            System.out.println("File is not found, plz check the path");
        }
        try{
            br = new BufferedReader(fr);
            String data = "";
            while ((data = br.readLine()) != null){
            System.out.println(data);

            }
        }catch (Exception ex){
            System.out.println("File is not readable");
        }
    }
}
