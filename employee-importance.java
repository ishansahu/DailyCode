/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap();
        for(Employee emp : employees) map.put(emp.id, emp);
        Queue<Employee> queue = new LinkedList();
        int sum=0;
        queue.add(map.get(id));
        while(!queue.isEmpty()){
            Employee emp = queue.poll();
            sum += emp.importance;
            for(Integer sub : emp.subordinates) queue.add(map.get(sub));
        }
        return sum;
    }
}