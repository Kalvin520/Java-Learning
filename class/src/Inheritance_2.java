class circle{
    int radius;
    circle(){ //無參數建構子
        radius=2;
    }

    circle(int r){//一個參數建構子
        radius=r;
    }

    int getRadius(){//回傳半徑方法

        return radius;
    }

    double getarea(){
        return radius*radius*Math.PI;
    }
}

class Cylinder extends circle{
    int length;
    Cylinder(){
        this(2,3);//有參數時會執行下面那個建構子Cylinder(int r,int l)
    }

    Cylinder(int r,int l) {
        super(r);
        //執行父類的circle(int r)
        length = l;
    }
        int getlength(){
            return length;
    }
}

public class Inheritance_2 {
    public static void main(String[] args) {
        Cylinder cy1=new Cylinder();//新增物件使用預設建構子內的r=2 l=3
        System.out.println("The radius of the cylinder is "+cy1.getRadius());
        System.out.println("The cylinder length is "+cy1.getlength());

        System.out.println();

        Cylinder cy2=new Cylinder(1,2);//r=1 l=2
        System.out.println("The radius of the cylinder is "+cy2.getRadius());
        System.out.println("The cylinder length is "+cy2.getlength());

        circle ci1=new circle();//r=2
        System.out.println("The cylinder area is "+ci1.getarea());
        circle ci2=new circle(3);//r=3
        System.out.println("The cylinder area is "+ci2.getarea());


    }
}
