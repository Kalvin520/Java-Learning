public class Method1
{
    static String work(int d){ //method 1
        String e="Fail";
        if (d>=60)
            e="Pass";
        return e;
    }

    static void pr(String s){ //method 2
        System.out.println(s);
    }

    public static void main(String[] ars) {
        int d=60;
        String b;
        b=work(d);
        pr(b);


    }
}
