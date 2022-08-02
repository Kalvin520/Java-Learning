import java.io.*;
public class aa implements FilenameFilter{
    String ext;
    public aa(String ext){
        this.ext="."+ext;
    }
    public boolean accept(File dir,String name){
        return name.endsWith(ext);
    }
}