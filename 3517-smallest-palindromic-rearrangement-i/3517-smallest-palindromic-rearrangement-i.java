class Solution {
    public String smallestPalindrome(String s) {
        int[] arr = new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
        }
        int oddIdx =-1;
        for(int i=0;i<26;i++){
            if(arr[i] % 2 != 0){
                oddIdx=i;
                break;
            }
        }
        StringBuilder firstHalf = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int halfCount = arr[i] / 2;
            for (int j = 0; j < halfCount; j++) {
                firstHalf.append((char) (i + 'a'));
            }
        }
        String middle = (oddIdx != -1) ? String.valueOf((char) (oddIdx + 'a')) : "";
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();
        return firstHalf.toString() + middle + secondHalf;
    }
}