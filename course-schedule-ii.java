class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] mat = new int[numCourses][numCourses];
        int[] indegree = new int[numCourses];
        for(int[] course : prerequisites){
            int pre = course[1];
            int curr = course[0];
            if(mat[pre][curr] == 0) ++indegree[curr];
            mat[pre][curr]=1;
        }
        Queue<Integer> queue = new LinkedList();
        for(int i=0; i<numCourses; ++i){
            if(indegree[i]==0)queue.offer(i);
        }
        int count=0, res[] = new int[numCourses];
        
        while(!queue.isEmpty()){
            int temp = queue.poll();
            res[count++] = temp;
            for(int i=0; i<numCourses; ++i){
                if(mat[temp][i] !=0){
                    if(--indegree[i] ==0) queue.offer(i);
                }
            }
        }
        return count ==numCourses ? res: new int[0];
    }
}