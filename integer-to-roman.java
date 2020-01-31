class Solution {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
            if(num > 999){
                for(int i=0; i< num/1000; ++i) res.append("M");
                num%=1000;
            }if(num > 899){
                res.append("CM");
                num-=900;
            } if(num > 499 ){
                res.append("D");
                num-=500;
            } if(num > 399){
                res.append("CD");
                num-=400;
            }if(num > 99){
                for(int i=0; i< num/100; ++i) res.append("C");
                num%=100;
            }if(num > 89){
                res.append("XC");
                num-=90;
            }if(num > 49){
                res.append("L");
                num-=50;
            }if(num > 39){
                res.append("XL");
                num-=40;
            }if(num > 9){
                for(int i=0; i< num/10; ++i) res.append("X");
                num%=10;
            }if(num == 9){
                res.append("IX");
                num-=9;
            }if(num > 4){
                res.append("V");
                num-=5;
            }if(num == 4){
                res.append("IV");
                num-=4;
            }if (num > 0){
                for(int i=0; i< num; ++i) res.append("I");
            }
        return res.toString();
    }
}