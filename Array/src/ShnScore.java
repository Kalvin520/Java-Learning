import java.util.*;
public class ShnScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ScoreArray[]=new int[6];
        int score,searchNum;
        for (int i = 1; i <=5; i++) {
            System.out.println("Number:"+i);
            System.out.print("Please Enter Score: ");
            score=sc.nextInt();
            ScoreArray[i]=score;
        }
        System.out.println("Score Enter Finish! Thank you :D");
        System.out.println("Search Score");
        do {
            System.out.print("Please Enter Number: ");
            searchNum=sc.nextInt();
            if (searchNum==0&&searchNum>5)
                break;
            System.out.print("ChnScore: "+ScoreArray[searchNum]);
            System.out.println();
        }while(searchNum>0);

    }
}
