class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
        int res=0;
        while(!queue.isEmpty()){
            int temp = queue.poll();
            ++res;
            for(int i=0; i<numCourses; ++i){
                if(mat[temp][i] !=0){
                    if(--indegree[i] ==0) queue.offer(i);
                }
            }
        }
        return res == numCourses;
    }
}