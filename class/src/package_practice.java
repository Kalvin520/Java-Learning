import grade.Pass__;
import area.square;
public class package_practice {
    public static void main(String[] args) {
        int a=2,b=3,c;

        square sq=new square();
        sq.length=a;
        sq.width=b;
        sq.dispose();
        c=sq.area;

        System.out.println(c);

        int d=88;
        Pass__ pa__=new Pass__();
        pa__.score=d;
        pa__.dispose();
        String e=pa__.result;
        System.out.println(e);
    }
}
