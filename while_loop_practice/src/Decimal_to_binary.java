import java.util.*;
public class Decimal_to_binary {
    public static void main(String[] args) {

        //define
        int Decimal=0,N=0,r=0;
        String binary="";
        Scanner sc=new Scanner(System.in);

        System.out.print("請輸入十進制位數：");
        Decimal=sc.nextInt();
        System.out.print("請輸入Ｎ直：");
        N=sc.nextInt();

        //process
        while (Decimal>0){
            r=Decimal%N;
            binary=String.valueOf(r)+binary;
            Decimal=Decimal/N;//整數商
        }
        System.out.println("其"+N+"進位值為："+binary);

    }
}
