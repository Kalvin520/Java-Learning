import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a=5,b=4,c=3,t;

        if(a>b)
        {
            t=a;a=b;b=t;
        }
        if (b>c)
        {
            t=b;b=c;c=t;
        }
        if (a>b)
        {
            t=a;a=b;b=t;
        }
        System.out.println(+a+" "+b+" "+c);
    }

}
