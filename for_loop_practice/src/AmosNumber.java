public class AmosNumber {
    public static void main(String[] args) {
        int n=0;
        double sum1,sum2;

        for (int i=1;i<=9;i++)
            for (int j=0;j<=9;j++)
                for (int k=0;k<=9;k++){
                    sum1=100*i+10*j+k;
                    sum2=Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3);
                    if (sum1==sum2){
                        n++;
                        System.out.println(n+" : "+(int)sum1);
                    }
                }

    }
}
