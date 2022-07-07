import java.util.*;
public class Avg {
    public static void main(String[] args) {
        int data[]={77,66,99,44,55};
        int max=data[0];//High
        int min=data[0];//Low
        double sum=data[0];//Avg

        for (int i = 1; i <=4; i++) {
            sum+=data[i];//Because data[0]=77 +66.......55
            if (data[i]>max)
                max=data[i];
            if (data[i]<min)
                min=data[i];
        }
        System.out.println("Avg: "+(sum/5));
        System.out.println("High Score: "+max);
        System.out.println("Low Score: "+min);
    }
}
