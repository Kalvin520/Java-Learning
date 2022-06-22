import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //define
        int a=0,b=0,c=0;
        double d=0,x1,x2;
        String str="";

        //print
        System.out.print("Input a: ");
        a=in.nextInt();
        System.out.print("Input b: ");
        b=in.nextInt();
        System.out.print("Input c: ");
        c=in.nextInt();

        if (a==0) {
            System.out.print("輸入錯誤");
            return;
        }

        //process
        d=Math.pow(b,2)-4*a*c;
        if (d==0)
        str="only one answer,x1,x2= "+(-b/(2*a));
        else
            if (d>0) {
                x1 = (-b + Math.sqrt(d))/(2 * a);
                x2 = (-b - Math.sqrt(d))/(2 * a);
                str = "two answer,x1= " + x1 + " x2= " + x2;
            }
            else
                str="no real answer";
        System.out.println("The equation is "+str);
    }

}
