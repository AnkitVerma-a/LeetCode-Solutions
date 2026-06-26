class Solution {
    public String convertToTitle(int columnNumber) {
        String str = "";
        while (columnNumber > 0) {
            columnNumber--; 
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            str = Character.toString(ch) + str;
            columnNumber = columnNumber / 26;
        }
        return str;
    }
}