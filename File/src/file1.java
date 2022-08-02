import java.io.*;
public class file1 {
    public static void main(String[] args) {
        String a,b;
        a="E:/file_test";
        b="stream.txt";
        System.out.println("file path:"+a);
        System.out.println("file name:"+b);
        File dir=new File(a);
        File fileName=new File(a,b);
        System.out.println(fileName.exists());
        System.out.println(fileName.getParent());
        System.out.println(fileName.isFile());
        System.out.println(fileName.isDirectory());
        System.out.println(dir.isDirectory());
        System.out.println(fileName.canRead());
        System.out.println(fileName.canWrite());
        System.out.println(fileName.length());

    }
}
