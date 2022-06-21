import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Input 0(剪刀) 1(石頭) 2(布) :");

        String a1="",b1="",r="";
        int a=in.nextInt(),b;//a是你 b是電腦
        b=(int)(Math.floor((Math.random()*3)));//產生0,1,2的亂數

        switch (a){

            case 0:
                a1="剪刀";
                switch (b)
                {
                    case 0:
                        b1="剪刀";
                        r="平手";
                        break;
                    case 1:
                        b1="石頭";
                        r="電腦贏";
                        break;
                    case 2:
                        b1="布";
                        r="你贏";
                        break;

                }
                break;
            case 1:
                a1="石頭";
                switch (b)
                {
                    case 0:
                        b1="剪刀";
                        r="你贏";
                        break;
                    case 1:
                        b1="石頭";
                        r="平手";
                        break;
                    case 2:
                        b1="布";
                        r="電腦贏";
                        break;

                }
                break;
            case 2:
                a1="布";
                switch (b)
                {
                    case 0:
                        b1="剪刀";
                        r="電腦贏";
                        break;
                    case 1:
                        b1="石頭";
                        r="你贏";
                        break;
                    case 2:
                        b1="布";
                        r="平手";
                        break;

                }
                break;

        }
        System.out.print("你出:"+a+" "+a1+"\n");
        System.out.print("電腦出:"+b+" "+b1+"\n");
        System.out.print("結果是:"+r);
    }

}
