class Pass4{
    int score;
}

class Pass5{
    static int score;
}
public class classVar_With_InstanceVar {
    public static void main(String[] args) {
        // Instance demonstration
        // add new object pa1 pa2 pa3
        Pass4 pa1=new Pass4();
        Pass4 pa2=new Pass4();
        Pass4 pa3=new Pass4();
        System.out.println("implement InstanceVar:");
        pa1.score=10;
        pa2.score=20;
        pa3.score=30;
        System.out.println("pa2.score: "+pa2.score);
        pa3.score=40;
        System.out.println("pa1.score: "+ pa1.score);

        //class Var
        //add new object
        Pass5 sta1=new Pass5();
        Pass5 sta2=new Pass5();
        Pass5 sta3=new Pass5();
        System.out.println("implement InstanceVar:");
        sta1.score=30;
        System.out.println("sta2.score: "+sta2.score);
        sta3.score=40;
        System.out.println("sta1.score: "+ sta1.score);

        //direct quote
        Pass5.score=40;
        System.out.println("class Var direct quote is: ");
        System.out.println("Pass5.score: "+Pass5.score);

    }
}
