import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i <= n; i++) {
            System.out.print(i + "=");
            check(i);
        }
    }

    public static void check(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (n == i)
                    System.outs.println(i);
                else
                    System.out.print(i + "*");
                n = n / i;
            }
        }
    }
}