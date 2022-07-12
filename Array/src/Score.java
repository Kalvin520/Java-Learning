import java.util.*;
public class Score {
    public static void main(String[] args) {
        int score[][] = {{0, 0, 0, 0, 0, 0, 0},
                {1, 50, 60, 70, 0, 0, 0},
                {2, 30, 40, 50, 0, 0, 0},
                {3, 70, 80, 90, 0, 0, 0},
                {4, 66, 77, 88, 0, 0, 0},
                {5, 22, 33, 66, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0}};
        //Array [x][y]=[列(由上往下)][行(由左至右)]

        final int student = 5; //student have 5 person

        for (int j = 1; j <= student; j++) {
            for (int k = 1; k <=3; k++) {
                score[j][4]=score[j][4]+score[j][k];//calculate the average sum
            }
            score[j][5]=score[j][4]/3;//calculate the average
        }
    
        for (int j =1;j<=student;j++)//statistics failed
            for (int k=1;k<=3;k++)
                if (score[j][k]<60)
                    score[j][6]++;


        for (int j=1;j<=4;j++){//statistics average
            for (int k=1;k<=student;k++)
                score[student+1][j]=score[student+1][j]+score[k][j];
            score[student+1][j]/=student;
        }

        //print
        System.out.println("Number  Chn  Eng  Math  Total  Ave  Failed");
        for (int i=1;i<=student+1;i++){
            for (int j=0;j<7;j++)
                System.out.print("  " +score[i][j] + "  ");
            System.out.println();
        }
    }
}
