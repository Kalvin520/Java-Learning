import java.sql.PseudoColumnUsage;

class pass1{
    //add member
    int score;
    String result;

    pass1(){ //constructors name must be same as class name
        score=22;
    }

    //Method member
    void dispose(){
        result="failed";
        if (score>=60)
            result="Pass";
    }



}

public class constructors_score {

    public static void main(String[] args) {
        pass1 pa=new pass1();//add new object set score=22
        pa.dispose();//implement object Method
        String b=pa.result;//retrieve data member
        System.out.println(b);


    }

}
