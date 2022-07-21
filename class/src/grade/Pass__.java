package grade;

public class Pass__ {
    public int score;
    public String result;

    public void dispose(){
        result="failed";
        if (score>=60)
            result="Pass";
    }
}
