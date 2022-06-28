import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        boolean flag=true;//先認定flag為質樹
        for (int i=2;i<=in-1;i++)
            if (in%i==0){
                flag=false;
                break;
            }
        if (flag=true)
            System.out.println(in+" 是質數 ");
        else
            System.out.println(in+" 不是質數 ");

    }
}
