class Solution {
    public int[] intersection_mySol(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        
        int i=0, j=0;
        HashSet<Integer> set = new HashSet<>(); 
        while(i < num1.length && j < num2.length){
            if(num1[i]==num2[j] && !set.contains(num1[i])){
                set.add(num1[i]);
                i++;j++;
            }else if(num1[i] > num2[j]) j++;
            else i++;
        }
        int[] res = new int[set.size()];
        int k = 0;
        for (Integer val : set) res[k++] = val;
        return res;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums1) {
            set.add(i);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for(int i: nums2) {
            if(set.contains(i)) {
                intersection.add(i);
            }
        }
        int result[] = new int[intersection.size()];
        int index = 0;
        for (int i: intersection) {
            result[index++] = i;
        }
        
        return result;
    }
}
