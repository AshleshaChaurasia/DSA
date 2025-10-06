public class maxSubarraySum {

    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        //calculate prefix array
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                maxSum = Math.max(currSum, maxSum);
            }
        }

        System.out.println("Max sum = " + maxSum);

    }

    public static void kadanes(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Our maximum subarray sum is: " + maxSum);
    }


    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // maxSubarraySum(numbers);
        kadanes(numbers);
    }
}
