class Pass3{
    private int score;
    public String result;
    public boolean setscore(int a){
        if (a>=0&&a<=100){
            score=a;
        return true;
        }
        else{
            System.out.println("Input Error");
            return false;
        }
    }

    public void dispose(){
        result="failed";
        if (score>=60)
            result="Pass";
    }
}


public class Encapsulation_Practice {
    public static void main(String[] args) {
        Pass3 ps3=new Pass3();
        boolean c=ps3.setscore(-1);
        if (c){
            ps3.dispose();
            System.out.println(ps3.result);
        }


    }
}
