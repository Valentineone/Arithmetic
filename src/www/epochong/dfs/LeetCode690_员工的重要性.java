package www.epochong.dfs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author epochong
 * @date 2019/7/29 18:42
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
public class LeetCode690_员工的重要性 {
    public static int sum = 0;
    public static Map<Integer,Employee> map = new HashMap <>();
    public static void DFS(int id) {
        sum += map.get(id).importance;
        for (int i :
                map.get(id).subordinates) {
            DFS(i);
        }
    }
    public int getImportance(List<Employee> employees, int id) {
        if (employees.isEmpty()) {
            return 0;
        }
        for (Employee e :
                employees) {
            map.put(e.id, e);
        }
        DFS(id);
        return sum;
    }
}
