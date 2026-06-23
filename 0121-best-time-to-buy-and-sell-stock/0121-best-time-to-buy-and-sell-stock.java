class Solution {
    public int maxProfit(int[] prices) {
      int minval=prices[0];
      int maxProfit=0;
      for(int current : prices){
        if(current<minval){
            minval=current;
        }else if(current-minval>maxProfit){
            maxProfit=current-minval;
        }
      }
        return maxProfit;
    }
}