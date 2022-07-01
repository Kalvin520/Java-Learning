public class rand {
    public static void main(String[] args) {
        int rand=0,sum=0;
        do {
            rand=(int)Math.floor(Math.random()*6);
            System.out.print(rand+" ");
            sum+=rand;
        }
        while (rand!=0);
        System.out.println();
        System.out.println("This sum is "+sum);
    }
}
