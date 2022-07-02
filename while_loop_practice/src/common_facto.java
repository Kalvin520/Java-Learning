import java.util.*;
public class common_facto {
    public static void main(String[] args) {
        //define
        int a=0,b=0;
        int r;//餘數
        Scanner sc=new Scanner(System.in);
        //process
        System.out.print("Please Enter A value:");
        a= sc.nextInt();
        System.out.print("Please Enter B value:");
        b= sc.nextInt();

        do {
            r=a%b;
            a=b;
            b=r;
        }
        while (r>0);
        System.out.println("greatest common factor is:"+a);
    }
}
