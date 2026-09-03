class Solution {
    public int countMonobit(int n) {
        int value=0;
        int i=0;
        while(value<=n){
            value+=Math.pow(2,i);
            i++;
        }
        return i;
    }
}