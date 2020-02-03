class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        for(String str : s.split(" ")) res.append(new StringBuilder(str).reverse()+" ");
        return res.toString().trim();
    }
}