public class ArrayTransfer {
        static int maxf(int b[]) {
            int max=b[0];
            int l=b.length;
            for (int i=1;i<=l-1;i++) {//請留意陣列範圍
                if (b[i]> max)
                    max=b[i];
            }
            return (max);
        }
        static void doublef(int b[],int d[]) {
            int l=b.length;
            for (int i=0;i<=l-1;i++) {//請留意陣列範圍
                d[i]=b[i]*2;
            }
            return ;
        }
        static int[] doublef2(int b[]) {
            int l=b.length;
            int d[]= new int[5];
            for (int i=0;i<=l-1;i++) {//請留意陣列範圍
                d[i]=b[i]*2;
            }
            return d ;
        }
        static void f(int b[][],int r,int c) {
            for (int i=0;i<=r-1;i++) //請留意陣列範圍
                for (int j=0;j<=c-1;j++)
                    b[i][j]=b[i][j]*2;
        }
        public static void main(String[] args) {
            int a[]= {8,7,1,5,4};
            int b=maxf(a);//陣列的寫法
            System.out.println(b);
            int c[]=new int [5];
            doublef(a,c);
            int l=c.length;
            for (int i=0;i<=l-1;i++) {//請留意陣列範圍
                System.out.print(c[i]+",");
            }
            System.out.println();

            int d[]= new int[5];
            d=doublef2(a);
            l=d.length;
            for (int i=0;i<=l-1;i++) {//請留意陣列範圍
                System.out.print(d[i]+",");
            }
            System.out.println();

            int e[][]= {{1,2,3},{4,5,6}};
            int cc=2,rr=3;
            f(e,cc,rr);
            for (int i=0;i<=cc-1;i++) {//請留意陣列範圍
                for (int j=0;j<=rr-1;j++)
                    System.out.print(e[i][j]+"  ");
                System.out.println();
            }
        }



}
