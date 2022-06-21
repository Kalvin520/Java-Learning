import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String season;
        int a=in.nextInt();

        switch (a)
        {
            case 1:
                season="春";
                System.out.println(season);
                break;
            case 2:
                season="夏";
                System.out.println(season);
                break;
            case 3:
                season="秋";
                System.out.println(season);
                break;
            case 4:
                season="冬";
                System.out.println(season);
                break;
        }
    }

}
