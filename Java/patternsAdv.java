public class patternsAdv{

    public static void hollowRectangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i==1||i==totRows||j==1||j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){
        //outer
        for(int i=1; i<= n; i++){
            //space
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numPyramid(int rows){
        //outer
        int n = rows;
        for(int i=1; i<= rows; i++){
            //number
            for(int j =1; j<=n ; j++){
                System.out.print(j);
            }
            n = n-1 ;
            //space
            for(int j=1; j<= i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void floydTri(int n){
        int num =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void zoTri(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0)){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhommbus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromic(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // hollowRectangle(4, 5);
        // pyramid(4);
        // numPyramid(5);
        // floydTri(5);
        // zoTri(5);
        // butterfly(4);
        // solidRhombus(5);
        // hollowRhommbus(5);
        // diamond(4);
        // numberPyramid(5);
        palindromic(5);
    }
}