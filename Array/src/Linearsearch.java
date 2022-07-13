import java.util.*;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

    String PN[][] = {{"0", "0"}, {"aa", "1111168"}, {"hh", "2222168"},
            {"cc", "3333168"}, {"gg", "4444168"}, {"ff", "5555168"},
            {"ii", "6666168"}, {"ee", "7777168"}, {"bb", "8888168"},
            {"jj", "9999168"}, {"dd", "1688168"}, {"kk", "2688168"},
            {"ll", "3688168"}};

    String name;
    boolean found=false;

    System.out.print("Please Enter Name: ");
    name=sc.nextLine();

    for (int i=1;i<=12;i++)
    {
        if (name.compareToIgnoreCase(PN[i][0])==0) {
            System.out.println("PhoneNumber is: "+PN[i][1]);
            found = true;
            break;
        }
    }
    if (found==false)
        System.out.println("NO Body");

    }
}
