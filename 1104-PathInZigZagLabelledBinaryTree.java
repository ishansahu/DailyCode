class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        int elem= label;
        int depth, offset;
        List<Integer> res = new ArrayList<>();
        res.add(0,elem);
        while(elem != 1){
            depth = (int)(Math.log(elem)/Math.log(2));
            offset = (int)(Math.pow(2,depth+1)-1-elem);
            elem = (int)(Math.pow(2,depth)+offset)/2;
            res.add(0,elem);
        }
       //Collections.reverse(res);
        return res;
    }
}