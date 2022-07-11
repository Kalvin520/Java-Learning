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
    }
}
