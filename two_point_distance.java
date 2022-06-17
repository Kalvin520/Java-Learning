import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x1=0,x2=0,y1=0,y2=0;
        double AnsWer=0;

        Scanner scanner_in=new Scanner(System.in);

        //x1
        System.out.print("Input x1:");


        //y1
        System.out.print("Input y1:");
        y1=scanner_in.nextInt();

        //x2
        System.out.print("Input x2:");
        x2=scanner_in.nextInt();

        //y2
        System.out.print("Input y2:");
        y2=scanner_in.nextInt();


        //process
        AnsWer=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

        //output
        System.out.println("The distance is: "+AnsWer);
    }
}
