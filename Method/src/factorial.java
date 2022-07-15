public class factorial {
        public static int Factorial(int i){
            if (i==1)
                return i;

            else
                return i*Factorial(i-1);
        }

        public static void main(String[] args) {
            int i=5;
            System.out.println("5!="+Factorial(i));
        }
}
