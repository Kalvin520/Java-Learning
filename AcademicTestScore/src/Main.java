import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a=25;//ABE
        int b=25;
        b=17;//AE

        //b=1;//E
        //b==2;//D
        //b=0;//未作答

        int c,d=0;
        int e;//得分
        if (b==0) {
            e=0;
        }
        else {
            c = a ^ b;//逐位元xor,位元相同是0ㄝ,不同是1
            d = 0;
            System.out.println(c);
            c = ~c;
            System.out.println(c);
            d = d + (c & 1);//計算1的個數
            //d=d＋c&1//錯，因為＋的優先序大於＆

            c = c >> 1;//右移
            d = d + (c & 1);

            c = c >> 1;
            d = d + (c & 1);

            c = c >> 1;
            d = d + (c & 1);

            c = c >> 1;
            d = d + (c & 1);

            System.out.println(d);
            if (d == 5)
                e = 5;
            else if (d == 4)
                e = 3;
            else if (d == 3)
                e = 1;
            else
                e = 0;
        }
        System.out.println(e);



    }
}
