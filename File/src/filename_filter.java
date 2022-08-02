import java.io.*;
public class filename_filter {
    public static void main(String[] args) {
        String a,b;
        a="E:/file_test";
        System.out.println("file path:"+a);
        File dir=new File(a);
        aa only=new aa("txt");
        String s[]=dir.list(only);
        for (int i=0;i<s.length;i++){
            File f=new File(a+"/"+s[i]);
            if (f.isDirectory())
                System.out.println(s[i]+" is a dir");
            else
                System.out.println(s[i]+" is a file");

        }
    }
}
