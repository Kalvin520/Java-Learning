public class test1 {
    public static void main(String[] args) {
        //s=3+6+9剛好超過1000
        int i=0,sum=0;
        while (sum<1000){

            sum+=3;
            i++;
        }
        System.out.println(sum);
        System.out.println(i);
    }
}