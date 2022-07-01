import java.util.*;
public class AnyNumberSum {
    public static void main(String[] args) {
        System.out.print("請輸入任意數（-1退出):");

        //輸入
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int i=0,sum=0;

        while (num1!=-1) {
            sum += num1;
            i++;
            System.out.print("請輸入任意數（-1退出):");
            num1=sc.nextInt();
        }
        System.out.println("其個數是： "+i);
        System.out.println("其和是： "+sum);
    }
}
