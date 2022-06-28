public class PrimeNumber2 {
    public static void main(String[] args) {
        int k=0;
        boolean flag=true;//預設flag質數＝true
        System.out.println("2~1000的質數如下所示：");
        for (int i=2;i<=1000;i++){
            flag=true;
            for (int j=2;j<=i-1;j++){
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                System.out.print(i+"  ");
                k++;
                if (k%10==0)
                    System.out.println();
            }
        }
        System.out.println();
        System.out.println("共有"+k+"個質數");
    }
}
