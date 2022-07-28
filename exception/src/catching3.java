public class catching3 {
    public static void main(String[] args) {
        try {
            int a=6;
            int b=0;
            System.out.println("1."+a/b);
        }
        catch (IndexOutOfBoundsException exception){
            System.out.println("2: "+exception.getMessage());
        }
        finally {
            System.out.println("3.QAQ");
        }
        System.out.println("4.QWQ");
    }
}
