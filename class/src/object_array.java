class Pass6{
    //data member
    private int score;
    public String result;

    public Pass6(int a){//constructor
        if (a>=0&&a<=100)
            score=a;


    }

    public int Getscore(){
        return score;
    }

    public boolean Setscore(int a){
        if (a>=0&&a<=100){
            score=a;
            return true;
        }
        else {
            System.out.println("Input error");
            return false;
        }
    }

    public void dispose(){
        result="failed";
        if (score>=60)
            result="Pass";
    }
}
public class object_array {
    public static void main(String[] args) {

        Pass6 pa[]=new Pass6[4];
        pa[0]=new Pass6(40);
        pa[1]=new Pass6(20);
        pa[2]=new Pass6(80);
        pa[3]=new Pass6(90);

        for (int i=0;i<4;i++){
            System.out.print(pa[i].Getscore()+"  ");
            pa[i].dispose();
            System.out.println(pa[i].result);
        }
    }
}
