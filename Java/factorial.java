public class factorial {

    public static int fact(int n){
        int f = 1;
        if (n == 0) {
            f = 1;
        }else{
            for(int i=1; i <= n; i++){
                f = f*i;
            }
        }
        return f;
    }

    public static int binomialFact(int n, int r){
        int a = fact(n);
        int b = fact(r);
        int c = fact(n-r);
        int result = a/(b*c);
        return result;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fact(n));
        System.out.println(binomialFact(5, 2));
    }
}
