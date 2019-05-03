package www.wangchong.study;
import java.util.*;

public class HashMapDel {

    public static void main(String args[]) {
// 构造 hashmap
        HashMap newmap = new HashMap();

// 给 hashmap 赋值
        newmap.put(1, "tutorials");
        newmap.put(2, "point");
        newmap.put(3, "is best");

        System.out.println("Values before remove: "+ newmap);

// 移除 key 为 2 的 value
        newmap.remove(2);

        System.out.println("Values after remove: "+ newmap);
    }
}
