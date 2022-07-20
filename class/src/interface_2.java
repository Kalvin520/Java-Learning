import java.util.*;
interface Pass13{
    int p1=60;
    void dispose();
}

interface good{
    int p3=90;
    void excel();
}

class Student implements good,Pass13{
    //data member
    int score;
    String result;
    public void dispose(){
        result="failed";
        if (score>=p1)
            result="Pass";
    }

    public void excel(){
        result="";
        if (score>=p3)
            result="excellent";
    }
}

public class interface_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.printf("Please enter score:");
        a=sc.nextInt();
        Student pa =new Student();

        pa.score=a;
        pa.dispose();
        System.out.println(pa.result);

        pa.excel();
        System.out.println(pa.result);
    }
}
