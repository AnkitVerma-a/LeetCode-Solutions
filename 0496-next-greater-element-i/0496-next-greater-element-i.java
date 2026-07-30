class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr =new int[nums1.length];
        int count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(j<nums2.length-1){
                        int max=nums1[i];
                        for(int k=j;k<nums2.length;k++){
                            if(nums2[k]>max){
                                max=nums2[k];
                                break;
                            }
                        }
                        if(max==nums1[i]){
                            arr[count]=-1;
                            count++;
                        }else{
                            arr[count]=max;
                            count++;
                        }
                    }else{
                        arr[count]=-1;
                        count++;
                    }
                }
            }
        }
        return arr;
    }
}