class Solution {
    public int countMonobit(int n) {
        int value=0;
        int i=0;
        while(value<=n){
           value += (1 << i);
            i++;
        }
        return i;
    }
}