class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (n1,n2) -> (n1[0] == n2[0]) ? n1[1]-n2[1] : n2[0] - n1[0]);
        List<int[]> res = new ArrayList();
        for(int[] temp: people){
            res.add(temp[1], temp);
        }
        return res.toArray(new int[res.size()][2]);
    }
}