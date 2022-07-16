class Pass{
    //add member
    int score;
    String result;

    //Method member
    void dispose(){
        result="failed";
        if (score>=60)
            result="Pass";
    }
}

public class score {

    public static void main(String[] args) {
        int a=88;
        Pass pa=new Pass();//add new object
        pa.score=a;//set object data member
        pa.dispose();//implement object Method
        String b=pa.result;//retrieve data member
        System.out.println(b);


    }

}
