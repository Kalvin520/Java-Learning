import java.util.*;
public class DecimalConversion {
    public static void main(String[] args) {
        String Decimal[]={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        Scanner sc=new Scanner(System.in);
        int Decimal_system,N_system,r;
        String strn="";


        System.out.print("Please Enter Decimal: ");
        Decimal_system=sc.nextInt();

        int temp=Decimal_system;

        System.out.print("Please Enter N_system: ");
        N_system=sc.nextInt();
        System.out.println();

        while (Decimal_system>0){
            r=Decimal_system%N_system;
            strn=Decimal[r].concat(strn); //strn=Decimal[r]+strn //String add
            Decimal_system=Decimal_system/N_system;//integer Quotient
        }
        System.out.println(temp+" To "+N_system+" is: "+strn);
        System.out.println("Bye!");

    }
}
