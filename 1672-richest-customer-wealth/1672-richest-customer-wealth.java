class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int bankMoney : customer) {
                currentWealth += bankMoney;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        
        return maxWealth;
    }
}
