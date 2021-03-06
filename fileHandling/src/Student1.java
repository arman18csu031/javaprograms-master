import java.io.*;
import java.util.*;
class FileHandling1 {
class Student1 {

    static void input() {
        File f = null;
        try {
            f = new File("D:\\college2\\javaprograms\\fileHandling\\files\\student.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
            Student s[] = new Student[5];
            for (int i=0; i<5; i++) {
                s[i] = new Student();
                s[i].setStudent();
                bout.write(s[i].toString());
                bout.newLine();
            }
            
            bout.close();
        }        
        catch (Exception e) {
        // if any I/O error occurs
            e.printStackTrace();
        }
    }

    static void output() {
        File f=null;
        try {
            f = new File("C:\\College\\Java_FOCPII\\FileHandling\\files\\student.txt");
            FileReader fin = new FileReader(f);
            BufferedReader bin= new BufferedReader(fin);
            String sr;
            System.out.println("The contents of the file are: ");
            System.out.println("S.No\tName\tCGPA\tgrade");
            while((sr=bin.readLine())!=null){
                System.out.println(sr);
            } 
        }
        catch (Exception e) {
        // if any I/O error occurs
            e.printStackTrace();
        }
        
    }

    static void search() {
        File f = null;
        try {
            boolean flag=true;
            FileReader fin = new FileReader(f);
            String s;
            BufferedReader bin= new BufferedReader(fin);
                while ((s=bin.readLine())!=null && flag) {
                    if(s.equals("me")) {
                        System.out.print("Present");
                    flag=false;
                }

            } 
        } catch (Exception e) {
                e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        char c;
        do {
            ch = input.next().charAt(0);
            switch(ch) {
                case 'i' : input();
                        break;
                case 'o' : output();
                        break;
                case 's' : search();
                        break;
                default : System.out.println("INVALID");
            }
           
            c = input.next().charAt(0);
        } while (c=='y');
        
    }
