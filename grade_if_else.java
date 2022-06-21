import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

                int grade = 0;
                String Level = "";
                System.out.print("Input a Grade:");
                grade = in.nextInt();
                if (grade >= 90)
                        Level = "A";
                else if (grade >= 80)
                        Level = "B";
                else if (grade >= 70)
                        Level = "C";
                else
                        Level = "D";

                System.out.println("The Grade is " + Level);
        }
}
