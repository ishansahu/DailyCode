class Solution {
    
    public int findCircleNum(int[][] m) {
        if(m== null || m.length <1) return 0;
        boolean[] visited = new boolean[m.length];
        int count=0;
        for(int i =0; i<m.length; i++){
            if(!visited[i]){
                count++;
                findFriends(m,visited,i);
            }
        }
        return count;
    }
    
    public void findFriends(int[][] m, boolean[] visited, int index){
        visited[index] = true;
        for(int i=0; i<m.length; i++){
            if(!visited[i] && i != index && m[index][i] ==1){
                findFriends(m,visited,i);
            }
        }
    }
    
}