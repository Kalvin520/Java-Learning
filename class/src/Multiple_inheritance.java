import java.util.*;
interface Pass14{
    int p1=60;
    void dispose();
}

interface good2{
    int pm=70;
    void excel();
}

interface A extends Pass14,good2{

}

class Student2 implements A{
    int score;
    String result;

    public void dispose(){
        result="failed";
        if (score>=60)
            result="Pass";
    }

    public void excel(){
        result="";
        if (score>=70)
            result="excellent";
    }
}
public class Multiple_inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("please enter score:");
        a=sc.nextInt();
        Student2 pa=new Student2();

        pa.score=a;
        pa.dispose();
        System.out.println(pa.result);

        pa.excel();
        System.out.println(pa.result);
    }
}
