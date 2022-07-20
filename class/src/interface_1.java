import java.util.*;
public class interface_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.printf("Please enter score:");
        a=sc.nextInt();
        Collage2 co1 = new Collage2();
        co1.score=a;
        co1.dispose() ;
        System.out.println("Colloge score (60=Pass)");
        System.out.println("result: " +co1.result);

        Master2 ma1 = new Master2();
        ma1.score=a;
        ma1.dispose() ;
        System.out.println("master score (70=Pass)");
        System.out.println("result: " +ma1.result);
    }
}

    //Pass 介面
interface Pass12{
    int pc=60;
    int pm=70;
    void dispose();
}

// Collage 類別
class Collage2 implements Pass12{
//資料成員
    protected int score;
    protected String result;
    public void dispose(){
        result="failed";
        if (score>=pc)
        result="Pass";
    }
}

//類別 Master
class Master2 implements Pass12{
//資料成員
    protected int score;
    protected String result;
    public void dispose()  {
        result="failed";
        if (score>=pm)
        result="Pass";
        }
    }