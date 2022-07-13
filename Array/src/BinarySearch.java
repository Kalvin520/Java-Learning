import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        String a[][] = {{"0", "0"},
                {"aa", "1111168"},
                {"hh", "2222168"},
                {"cc", "3333168"},
                {"gg", "4444168"},
                {"ff", "5555168"},
                {"ii", "6666168"},
                {"ee", "7777168"},
                {"bb", "8888168"},
                {"jj", "9999168"},
                {"dd", "1688168"},
                {"kk", "2688168"},
                {"ll", "3688168"}};

        boolean found=false;
        String name,temp;
        int u,l,m;


        //BubbleSort(small~big)
        for (int i=1;i<=11;i++){
            for (int j=1;j<=11-i;j++) {
                if (a[j][0].compareToIgnoreCase(a[j+1][0])>0){
                    temp=a[j][0];
                    a[j][0]=a[j+1][0];
                    a[j+1][0]=temp;
                }
            }
        }

        //print PhoneNumber
        for (int i = 1; i <=11; i++) {
            System.out.println(a[i][0]+"  "+a[i][1]);
        }

        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Name: ");
        name=sc.nextLine();//Read Name

        //Search (BinarySearch)
        l=1; //Low
        u=12;//Top

        while ((l<=u) &&!found) {
            m = (int) ((l + u) / 2);

            //String compare A=a return 0
            if (name.compareToIgnoreCase(a[m][0]) == 0) {
                System.out.println("PhoneNumber is: " + a[m][1]);
                found = true;
                break;
            } else if (name.compareToIgnoreCase(a[m][0]) > 0)
                l = m + 1;//Adjustment Low
            else
                u = m - 1;//Adjustment Top
        }
        if (found==false)
            System.out.println("NO Person");
    }
}
