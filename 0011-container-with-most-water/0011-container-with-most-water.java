class Solution {
    public int area(int a,int b,int[] height){
        return Math.abs(a-b)*Math.min(height[a],height[b]);
    }
    public int maxArea(int[] height) {
        int max=0;
        int i = 0;
        int j=height.length-1;
        while(i<j){
            if(max<area(i,j,height)){
                max = area(i,j,height);
            }
           if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}