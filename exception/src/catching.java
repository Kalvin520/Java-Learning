public class catching {
    public static void main(String[] args) {
        try {
            int a=6;
            int b=0;
            System.out.println(a/0);
        }
        catch (ArithmeticException exception){
            System.out.println("1: "+exception.getMessage());
            System.out.println("2: "+exception.toString());
            System.out.println("3: "+exception.getLocalizedMessage());
            System.out.println("4: ");
            exception.printStackTrace();
        }
    }
}
