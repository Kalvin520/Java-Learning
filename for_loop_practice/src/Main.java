public class Main {
    public static void main(String[] args) {

        int i,sum=0;

        for( i=1;i<=10;i++) {
            if (i == 5)
                continue;
            if (i == 8)
                break;
            System.out.println("i="+i);
            sum += i;
        }
            System.out.println("sum="+sum);
            System.out.println("離開迴圈時i＝"+i);

    }
}