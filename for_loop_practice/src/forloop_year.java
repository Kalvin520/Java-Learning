public class forloop_year {
    public static void main(String[] args) {
        //define
        int c=0;//閏年次數
        int a4=0,a100=0,a400=0;
        String str="";

        //loop
        for (int i=1;i<=2000;i++){
            a4=i%4;
            a100=i%100;
            a400=i%400;

            if (a4==0 && !((a100==0) && !(a400==0))){
                c++;
                str=String.valueOf(c)+":"+String.valueOf(i);
                System.out.println(str);

            }


        }


    }
}
