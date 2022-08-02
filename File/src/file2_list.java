import java.io.*;
public class file2_list {
    public static void main(String[] args) {
        String a,b;
        a="E:/file_test";
        System.out.println("file path:"+a);
        File dir=new File(a);
        String s[]=dir.list();
        for (int i=0;i<s.length;i++){
            File f=new File(a+"/"+s[i]);
            if (f.isDirectory())
                System.out.println(s[i]+" is a dir");
            else
                System.out.println(s[i]+" is a File");
        }

    }
}
