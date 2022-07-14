public class One_dimensional_quadratic_equation {
    static void equ(int a,int b,int c,double d[]) {
        double e=Math.sqrt(b*b-4*a*c);
        d[0]=(-b+e)/(2*a);
        d[1]=(-b-e)/(2*a);
    }
    public static void main(String[] args) {
        int a=2,b=-7,c=3;
        double d[]=new double[2];
        equ(a,b,c,d);
        System.out.println(d[0]);
        System.out.println(d[1]);
    }
}
