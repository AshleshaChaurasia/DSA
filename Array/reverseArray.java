public class reverseArray {
    
    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length - 1;
        
        while(first < last){
            int temp = numbers[last];
            last = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]){

        int numbers[] = {2,4,6,8,10};
        reverse(numbers);

        // print reversed array
        for(int i=0; i<= numbers.length-1; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed array!!");
    }
}
