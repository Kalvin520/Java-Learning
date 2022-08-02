import java.io.*;
import java.util.Date;
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


        //practice1
        File dir2=new File("E:/file_test/stream.txt");
        long timestamp=dir2.lastModified();
        System.out.println("stream.txt file last revise time = "+new Date(timestamp));
        //practice2
        String c=dir2.getParent();
//        File mm=new File(c,File.pathSeparator+"new.txt");
//        if(dir2.renameTo(mm))
//        {
//            System.out.println("success!");
//        }
//        else
//        {
//            System.out.println("failed");
//        }
        //practice3

    }
}
