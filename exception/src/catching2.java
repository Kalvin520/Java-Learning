public class catching2 {
    public static void main(String[] args) {
        try {
            int a=6;
            int b=0;
            System.out.println(a/b);
            int[] c=new int[4];
            c[5]=3;
        }
        catch (ArithmeticException exception){
            System.out.println("1: "+exception.getMessage());
            System.out.println("2: "+exception.toString());
            System.out.println("3: "+exception.getLocalizedMessage());
            System.out.println("4: ");
            exception.printStackTrace();
        }
        catch (IndexOutOfBoundsException exception){
            System.out.println("1: "+exception.getMessage());
            System.out.println("2: "+exception.toString());
            System.out.println("3: "+exception.getLocalizedMessage());
            System.out.println("4: ");
            exception.printStackTrace();
        }

        catch (RuntimeException exception){
            System.out.println("1: "+exception.getMessage());
            System.out.println("2: "+exception.toString());
            System.out.println("3: "+exception.getLocalizedMessage());
            System.out.println("4: ");
            exception.printStackTrace();
        }

        catch (Exception exception){
            System.out.println("1: "+exception.getMessage());
            System.out.println("2: "+exception.toString());
            System.out.println("3: "+exception.getLocalizedMessage());
            System.out.println("4: ");
            exception.printStackTrace();
        }

        catch (Throwable exception){
            System.out.println("1: "+exception.getMessage());
            System.out.println("2: "+exception.toString());
            System.out.println("3: "+exception.getLocalizedMessage());
            System.out.println("4: ");
            exception.printStackTrace();
        }
    }
}
