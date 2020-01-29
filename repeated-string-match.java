class Solution {
    public int repeatedStringMatch(String A, String B) {
        int len1 = A.length(), len2 = B.length();
        int res = 1;
        if(A.contains(B)) return res;
        for(String st : B.split("")){
            if(!A.contains(st)) {
                System.out.println(st);
                return -1;}
        }
        String temp = A;
        while(temp.length() < 2*len2 || res <= 2 ){
            temp +=A;
            ++res;
            if(temp.contains(B)) return res;
        }
        return -1;
    }
}