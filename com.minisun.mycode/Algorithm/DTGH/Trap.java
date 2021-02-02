package Algorithm.DTGH;

public class Trap {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }


    /**
     * 接雨水
     * @param height
     * @return
     */
    public static int trap(int[] height){
        if(height == null || height.length == 0){
            return 0;
        }
        int ans = 0;
        int size = height.length;
        int[] left_max = new int[size];
        int[] right_max = new int[size];
        left_max[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left_max[i] = Math.max(height[i],left_max[i-1]);
        }
        right_max[size-1] = height[size-1];
        for (int i = size-2; i >= 0; i--) {
            right_max[i] = Math.max(height[i],right_max[i+1]);
        }
        for (int i = 1; i < size-1; i++) {
            ans +=Math.min(left_max[i],right_max[i])-height[i];
        }
        return ans;
    }
}
