import java.util.*;
abstract class Pass11{
    protected int score;
    protected String result;
    Pass11(){
        result="failed";
    }
    public void setscore(int value){
        score=value;
    }
    abstract public void dispose();//這個為抽象方法不用有任何實作在子類在實作即可

    public String getresult(){
        return result;
    }
}

class Colloge extends Pass11{
    public void dispose(){
        if (score>=60)
            result="Pass";
    }
}

class Master extends Pass11{
    public void dispose(){
        if (score>=70)
            result="Pass";
    }
}

public class abstract_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Colloge co=new Colloge();//新增物件co
        int score;
        String result;
        System.out.printf("Please enter score: ");
        score=sc.nextInt();
        co.setscore(score);
        co.dispose();
        result=co.getresult();
        System.out.println("Colloge score(score>=60=pass)");
        System.out.println("result: "+result);

        Master ma =new Master();
        ma.setscore(score);
        ma.dispose();
        result=ma.getresult();
        System.out.println("Master score(score>=70=pass)");
        System.out.println("result: "+result);

    }
}

