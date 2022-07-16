class Pass2{
    //add member
    int score;
    String result;

    Pass2(){ //constructor Pass2()
        score=22;
    }

    Pass2(int a){ //constructor Pass2(int)
        score=a;
    }


    //Method member
    void dispose(){
        result="failed";
        if (score>=60)
            result="Pass";
    }


}

public class OverloadingConstructors {
    public static void main(String[] args) {
        Pass2 pa=new Pass2();//add new object set score=22
        System.out.println(pa.score);
        pa.dispose();//implement object Method
        String b=pa.result;//retrieve data member
        System.out.println(b);


        int a=88;
        Pass2 pa2=new Pass2(a);//add new object set score=22
        System.out.println(pa2.score);
        pa2.dispose();//implement object Method
        b=pa2.result;//retrieve data member
        System.out.println(b);
    }
}
