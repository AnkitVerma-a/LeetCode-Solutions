class Solution {
    public static int longestConsecutive(int[] nums) {
        int MaxS=0;
        int sum=0;
        if(nums.length==0){
            return 0;
        }
        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            if(num<min)min=num;
            if(num>max)max=num;
        }
        int range=max-min+1;
        if(range<=100000){
            boolean[] present=new boolean[range];
            for(int num:nums){
                present[num-min]=true;
            }
            for(boolean isPresent:present){
                if(isPresent){
                    sum++;
                }else{
                    MaxS=Math.max(MaxS,sum);
                    sum=0;
                }
            }
        return Math.max(MaxS, sum);
        }else{
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            
            for (int num : set) {
                if (!set.contains(num - 1)) {
                    int current = num;
                    int localSum = 0;
                    while (set.contains(current)) {
                        current++;
                        localSum++;
                    }
                    MaxS = Math.max(MaxS, localSum);
                }
            }
            return MaxS;
        }
    }
}