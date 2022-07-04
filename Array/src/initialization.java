public class initialization {
    public static void main(String[] args) {
        int a[]={2,4,7,1,5};
        int b[]=new int[5];
        int sum=0;

        for (int i=0;i<5;i++)
            System.out.print(a[i]+" ");
        System.out.println();

        for (int i=0;i<5;i++)
            sum +=a[i];//Sum
        System.out.println("Sum="+sum);

        for (int i=0;i<5;i++)
            a[i]=a[i]*2;
        for (int i=0;i<5;i++)
            b[i]=a[i];//copy array

        for (int i=0;i<5;i++)
            System.out.print(b[i]+" ");
        System.out.println();
    }
}
