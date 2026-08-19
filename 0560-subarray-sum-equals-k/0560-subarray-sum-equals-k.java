class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int prefixsum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            if(prefixsum==k){
                count++;
            }
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }
            if(map.containsKey(prefixsum)){
                int freq=map.get(prefixsum);
                map.put(prefixsum,freq+1);
            }else{
                map.put(prefixsum,1);
            }
        }              
        return count;
    }
}