class circle2{
    int radius;
    circle2(){ //無參數建構子
        radius=2;
    }

    circle2(int r){//一個參數建構子
        radius=r;
    }

    int getRadius(){//回傳半徑方法

        return radius;
    }

    double getarea(){
        return radius*radius*Math.PI;
    }
}

class Cylinder2 extends circle2{
    int length;
    Cylinder2(){
        this(2,3);//有參數時會執行下面那個建構子Cylinder(int r,int l)
    }

    Cylinder2(int r,int l) {
        super(r);
        //執行父類的circle(int r)
        length = l;
    }
    int getlength(){
        return length;
    }

    //改寫父類getarea
    //傳回圓柱體表面積
    double getarea(){
        return 2*super.getarea()+(2*super.getRadius()*Math.PI*length);//呼叫父類getarea()
    }

    //傳回圓柱體體積
    //super練習
    double getvolume(){
        return super.getarea()*length;//呼叫父類的getarea(){}傳回圓面積
    }

    //this練習
    double thisarea1(){
        return this.getarea();//呼轎子類的getarea(){}
    }

    //回傳員住體表面積
    //跟thisarea1一樣結果只是如果呼叫自己不用加this
    double thisarea2(){
        return getarea();
    }

    //回傳圓面積
    double superarea(){
        return super.getarea();
    }

}

public class Inheritance_3 {
    public static void main(String[] args) {
        circle2 ci1=new circle2(2);//新增物件並傳值2
        Cylinder2 cy2=new Cylinder2(2,4);
        System.out.println("The circle area is "+ci1.getarea());
        System.out.println("The cylinder area is "+cy2.getarea());
        System.out.println("The cylinder volume is "+cy2.getvolume());

        System.out.println();

        System.out.println("Bottom area of cylinder is(super) "+cy2.superarea());
        System.out.println("The cylinder area is(this) "+cy2.thisarea1());
        System.out.println("he cylinder area is(omit this)"+cy2.thisarea2());
    }
}
