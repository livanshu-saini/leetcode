class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int ht = Math.min(height[left], height[right]);
            int wt = right- left;
            int temp = ht * wt;
            maxWater = Math.max(maxWater, temp);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        return maxWater;
    
    }
}