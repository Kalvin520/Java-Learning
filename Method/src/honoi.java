public class honoi{
    static String s="";

    static void moveRings(int n,char sourceTower,char goalTower
            ,char auxTower)  {

        if (n==1)
            s=s+"Ring " + n + " from " + sourceTower +" to "
                    +goalTower+"\n\r";
        else   {
            moveRings(n-1,sourceTower,auxTower,goalTower);
            s=s+"Ring " + n + " from " + sourceTower +" to "
                    +goalTower+"\n\r";
            moveRings(n-1,auxTower,goalTower,sourceTower);
        }
    }

    public static void main(String args[])  {
        int n=3;
        moveRings(n,'A','B','C');
        System.out.println(s);
    }
}
