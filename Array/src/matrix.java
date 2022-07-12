public class matrix {
    public static void main(String[] args) {
        int a[][]={ {-1,0,3},
                    {2,1,-2}};

        int b[][]={ {1,0},
                    {2,-3},
                    {-1,4}};

        int m=2,p=2,n=3;

        int c[][]=new int[m][p];

        //print A matrix
        System.out.println("A matrix is: ");
        for (int i=0;i<m;i++){ //2
            for (int j=0;j<n;j++) {//3
                System.out.print(a[i][j]+ "  ");
            }
            System.out.println();
        }

        //print B matrix
        System.out.println("B matrix is: ");
        for (int i=0;i<n;i++){//3
            for (int j=0;j<p;j++){//2
                System.out.print(b[i][j]+ "  ");
            }
            System.out.println();
        }

        //matrix multiply
        for (int i=0;i<m;i++){
            for (int j=0;j<p;j++){
                c[i][j]=0;
                for (int k=0;k<n;k++)
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
        }

        //print C matrix
        System.out.println("A-matrix Multiply B-matrix= ");
        for (int i=0;i<m;i++){
            for (int j=0;j<p;j++){
                System.out.print(c[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
