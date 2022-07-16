class water_bill{
    double water_degree;
    double money;

    void calculate(){

        if (water_degree>=100)
            money=water_degree*20;
        else
            money=water_degree*15.28;
    }

}
public class waterbill {
    public static void main(String[] args) {
        water_bill wb=new water_bill();
        wb.water_degree=44;
        wb.calculate();
        System.out.println((int)wb.money);
    }
}
