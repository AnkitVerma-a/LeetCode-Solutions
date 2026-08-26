class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        if(n1>n2){
            for(int i=0;i<n2;i++){
                if(!map.containsKey(nums2[i])){
                    map.put(nums2[i],1);
                }else{
                    map.put(nums2[i],map.get(nums2[i])+1);
                }
            }
            for(int i=0;i<n1;i++){
                if(map.containsKey(nums1[i])&&map.get(nums1[i])!=0){
                    nums2[count]=nums1[i];
                    count++;
                    map.put(nums1[i],map.get(nums1[i])-1);
                }
            }
            int[] arr=new int[count];
            for(int i=0;i<count;i++){
                arr[i]=nums2[i];
            }
            return arr;
        }else{
            for(int i=0;i<n1;i++){
                if(!map.containsKey(nums1[i])){
                    map.put(nums1[i],1);
                }else{
                    map.put(nums1[i],map.get(nums1[i])+1);
                }
            }
            for(int i=0;i<n2;i++){
                if(map.containsKey(nums2[i])&&map.get(nums2[i])!=0){
                    nums1[count]=nums2[i];
                    count++;
                    map.put(nums2[i],map.get(nums2[i])-1);
                }
            }
            int[] arr=new int[count];
            for(int i=0;i<count;i++){
                arr[i]=nums1[i];
            }
        return arr;
        }
    }
}