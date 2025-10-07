public class trappingRainwater{

    public static int trappedRainwater(int height[]){
        //calculate leftmax boundary -- Array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate rightmax boundary -- Array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int width = 1;
        int trappedWater = 0;

        for(int i=0; i<height.length; i++){

            //waterlevel = min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedWaterForThatBar = (waterlevel - height[i]) * width //widht = 1
            int barWater = (waterLevel - height[i]) * width;
            trappedWater += barWater;
        }

        return trappedWater;
    }
    public static void  main(String args[]){

        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));

    }
}