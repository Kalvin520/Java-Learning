class Pass7 {
    //data member
    int score;
    private String result;

    //Method member
    void dispose() {
        result = "failed";
        if (score >= 60)
            result = "Pass";

        Pass7_1 pa = new Pass7_1(); //initialization object
        pa.pr();
    }

    class Pass7_1{//inside Class
        void pr() {
            System.out.println(result);
        }
    }
}

public class insideclass {
    public static void main(String[] args) {
        int a=88;
        Pass7 pa7=new Pass7();
        pa7.score=a;
        pa7.dispose();
    }
}
