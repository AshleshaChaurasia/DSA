public class subArrays {

    public static void subArray(int numbers[]){
        int ts = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            // int start = i;
            for(int j=i; j<numbers.length;j++){
                // int end = j;
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum = sum + numbers[k];
                    // System.out.print(numbers[k] + " ");
                }
                maxSum = Math.max(sum, maxSum);
                minSum = Math.min(sum, minSum);
                System.out.print(sum + " ");
                ts++;
                // System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println("MaxSum is = " + maxSum);
        System.out.println("MinSum is = " + minSum);
        // System.out.println("Total subarrays : " + ts);
    }
    
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        subArray(numbers);
    }

}
