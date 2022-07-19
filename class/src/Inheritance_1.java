class Pass9{
    //data member
    protected int score;
    protected String result;

    void dispose(){
        result="failed";
        if (score>=60)
            result="Pass";
    }
}

class Pass10 extends Pass9{
    String excel;
    void dispose(){
        result="failed";
        if (score>=70)
            result="Pass";
    }

    public String good(){
        excel="newline";
        if (score>=90)
            excel="excellent";
        return excel;

    }
}
public class Inheritance_1 {
    public static void main(String[] args) {
        int a=88;
        String b,c;//define and add_object
        Pass10 pa10=new Pass10();
        pa10.score=66;//set object data_member
        pa10.dispose();//run Pass10 Method
        b= pa10.result;//failed
        c= pa10.good();//newline
        System.out.println(b);
        System.out.println(c);
        Pass9 pa9=new Pass9();
        pa9.score=66;
        pa9.dispose();
        b= pa9.result;
        System.out.println(b);//pass

    }
}
