import java.io.*;
public class file_input {
    public static void main(String[] args) throws IOException{
        File  filename=new File("test.txt");
        FileOutputStream f1=new FileOutputStream(filename);
        FileOutputStream f2=new FileOutputStream("test2.txt");
        FileOutputStream f3=new FileOutputStream("test3.txt",true);
    }
}
