class Solution {
    public int largestAltitude(int[] gain) {
        int height=0;
        int j=0;
        for(int i=0;i<gain.length;i++){
            if(height<(j+gain[i])){
                height = j+gain[i];
            }
            j=j+gain[i];
        }
        return height;
    }
}