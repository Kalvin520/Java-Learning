import java.io.*;
public class file_write {
    public static void main(String[] args) throws IOException{
        FileOutputStream f1=new FileOutputStream("test.txt");
        f1.write(65);
        byte[] b={65,66,67,68};
        f1.write(b);
    }
}
