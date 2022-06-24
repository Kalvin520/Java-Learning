import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //define
        int a=0,a4=0,a100,a400;
        String str="";

        System.out.print("輸入西元年份：");
        a=in.nextInt();

        //process
        a4=a%4;
        a100=a%100;
        a400=a%400;

        if (a4==0&& !((a100==0)&&!(a400==0)))
                str="閏年";
        else
            str="平年";

        System.out.println("該年為 "+str);
    }
}