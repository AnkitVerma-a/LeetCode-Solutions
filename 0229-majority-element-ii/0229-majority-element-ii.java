class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int firstelement=Integer.MAX_VALUE;
        int secondelement=Integer.MAX_VALUE;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==firstelement){
                count1++;
            }else if(secondelement==nums[i]){
                count2++;
            }else if(count1==0){
                firstelement=nums[i];
                count1=1;
            }else if(count2==0){
                secondelement=nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        List<Integer> ls=new ArrayList<>();
        count1=0;
        count2=0;
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==firstelement){
                count1++;
            }else if(nums[i]==secondelement){
                count2++;
            }
        }
        if(count1>n){
            ls.add(firstelement);
        }
        if(count2>n){
            ls.add(secondelement);
        }
        return ls;
    }
}