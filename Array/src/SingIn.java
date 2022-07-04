//package Array.src;
import java.util.*;
public class SingIn {
    public static void main(String[] args) {
        int a[]=new int [12];
        int b[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int count1,count2;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<12;i++)
        {
            if (b[i]==sc.nextInt())
                a[i]=1;
            else 
                a[i]=0;
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 12; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
