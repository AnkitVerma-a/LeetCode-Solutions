class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0){
            return false;
        }
        long sqrt = (long) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }
}