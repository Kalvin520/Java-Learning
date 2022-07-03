import java.util.*;
public class dichotomy {
    public static void main(String[] args) {
        double x1,x2,x,y,t;
        y=9;
        x1=0;
        x2=y;

        do {
            x=(x1+x2)/2;
            t=x*x;
            if (t<y)
                x1=x;//猜太小
            else
                x2=x;
        }
        while (Math.abs(x2-x1)>0.001);
        System.out.println(x1);
    }

}
