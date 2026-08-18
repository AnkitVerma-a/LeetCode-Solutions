class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int MaxS=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int sum=0;
                while(set.contains(current)){
                    current++;
                    sum++;
                }
                if(sum>MaxS){
                    MaxS=sum;
                }
            }
        }
        return MaxS;
    }
}