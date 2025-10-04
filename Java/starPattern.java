public class starPattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // INVERTED STAR

        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //HALF-PYRAMID

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //CHARACTER

        char ch = 'A';
        int k = 4;

        for(int i=1; i<=k; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
