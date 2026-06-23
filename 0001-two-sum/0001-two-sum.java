import  java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int comp = target-nums[i];
        if(map.containsKey(comp)){
            int[] arr = new int[2];
            arr[0] = map.get(comp);
            arr[1] = i;
            return arr;
        }else{
            map.put(nums[i],i);
        }
      }
      throw new IllegalArgumentException("No matching");
    }
}