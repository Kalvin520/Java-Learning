import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
        int a[]={0,77,66,99,44,55};
        int b[]=new int[6];
        final  int N=5;//const

        //set everyone equal 1
        for (int i = 1; i <=N ; i++)
            b[i]=1;

        //Sort
        for (int i=1;i<=N-1;i++)
            for (int j=i+1;j<=N;j++)//small plus one
                if (a[i]>a[j])
                    b[j]++;
                else
                    b[i]++;

        //print
        for (int i=1;i<=N;i++)
            System.out.print(a[i]+"  ");
        System.out.println();

        for (int i=1;i<=N;i++)
            System.out.print(b[i]+"   ");
        System.out.println();
    }
}
