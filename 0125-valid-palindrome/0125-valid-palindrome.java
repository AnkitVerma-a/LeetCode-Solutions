class Solution {
    public boolean isPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<high){
            char lc = s.charAt(low);
            char rc = s.charAt(high);
            if(!((lc>='A' && lc <='Z')||(lc>='a' && lc <='z')||(lc>='0'&& lc<='9'))){
                low++;
            }
            else if(!((rc>='A' && rc <='Z')||(rc>='a' && rc <='z')||(rc>='0'&& rc<='9'))){
                high--;
            }
            else{
                if (lc >= 'A' && lc <= 'Z') lc += 32;
                if (rc >= 'A' && rc <= 'Z') rc += 32;
                if(lc!=rc){
                    return false;
                }
            low++;
            high--;
            }
        }
        return true;
    }
}