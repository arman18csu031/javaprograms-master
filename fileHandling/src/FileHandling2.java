import java.io.*;
import java.util.*;
class FileHanling2 {
    public static void main(String[] args) {
        try {
            boolean flag=true;
            String s = null;
            FileReader fin = new FileReader(new File ("D:\\college2\\javaprograms\\fileHandling\\files\\FileHandling.txt"));
            BufferedReader bin= new BufferedReader(fin);

            while((s=bin.readLine())!=null && flag) {
                System.out.print(s);
                if(s.equals("1")) {
                    System.out.print("Present");
                    flag=false;
                }
            }
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
    }
}