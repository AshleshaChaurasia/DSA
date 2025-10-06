
public class binarySearch {

    public static int binarySearch(int number[], int key){
        int start = 0, end = number.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            //comparisions
            if(number[mid] == key){ //found
                return mid;
            }
            if(number[mid] < key){ //right
                start = mid+1;
            }else{ //left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int number[] = {2,4,6,8,10,12,14};
        int key = 45;

        System.out.println("Index for key is: " + binarySearch(number, key));
    }
}
