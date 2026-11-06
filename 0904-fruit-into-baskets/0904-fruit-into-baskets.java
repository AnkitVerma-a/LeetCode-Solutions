class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        Map<Integer,Integer> map = new HashMap<>();
        int len=0;
        while(r<fruits.length){
            if(map.containsKey(fruits[r])){
                map.put(fruits[r],map.get(fruits[r])+1);
            }else{
                map.put(fruits[r],1);
            }
            if(map.size()>2){
                if(map.get(fruits[l])==1){
                    map.remove(fruits[l]);
                }else{
                    map.put(fruits[l],map.get(fruits[l])-1);
                }
                l++;
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}