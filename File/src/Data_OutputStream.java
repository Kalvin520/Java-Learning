import java.io.*;
public class Data_OutputStream {
    public static void main(String[] args) throws IOException{
        FileOutputStream f=new FileOutputStream("test2.txt");
        DataOutputStream d=new DataOutputStream(f);
        String s="This is a book";
        d.writeBytes(s);
        d.close();

        FileOutputStream f1=new FileOutputStream("E:/file_test/stream.txt");
        DataOutputStream d1=new DataOutputStream(f1);
        String s1="stream test";
        d1.writeBytes(s1);
        d1.close();
    }
}
