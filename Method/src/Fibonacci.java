public class Fibonacci {

    public static int Fibonacci(int n){
        int var=0;
        if (n>2)
            var=Fibonacci(n-1)+Fibonacci(n-2);
        else
            var=1;

        return (var);

    }

    public static void main(String[] args) {
        int a=6;
        int sum=Fibonacci(a);
        System.out.println("Fabonacci Array: "+a+" varlue is "+sum);
    }
}
