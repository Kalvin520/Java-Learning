import java.util.Scanner;

public class ScannerUse {
      // 1.console function
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();//get user input
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();//get user input
        int sum = num1 + num2;  //sum two number
        System.out.println("Sum: " + sum);
        System.out.printf("Sum: %d%n", sum);
        System.out.print("Sum: " + sum + "\n");
        sc.close();
    }
}
