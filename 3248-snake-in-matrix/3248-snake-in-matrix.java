class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0;
        int j=0;
        for(String str:commands){
            switch (str) {
                case "UP"    -> i--;
                case "DOWN"  -> i++;
                case "LEFT"  -> j--;
                case "RIGHT" -> j++;
            }
        }
        return (i*n)+j;
    }
}