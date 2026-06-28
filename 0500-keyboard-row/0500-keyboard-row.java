class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        for(String str : words){
            String curr=str.toLowerCase();
            if(curr.matches("[qwertyuiop]+")){
                res.add(str);
            }else if(curr.matches("[asdfghjkl]+")){
                res.add(str);
            }else if(curr.matches("[zxcvbnm]+")){
                res.add(str);
            }
        }
        return res.toArray(new String[0]);
    }
}