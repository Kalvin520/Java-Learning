import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int a[]={0,77,66,99,44,55};
        int temp;
        final int N=5;
        for (int i=0;i<=N-1;i++)
            for (int j = 0; j <=N-1; j++)
                if (a[j]>a[j+1]) {
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

        //print
        for (int i = 0; i <=5; i++)
            System.out.print(a[i]+"  ");
        System.out.println();
    }
}
