package www.wangchong.study;

import java.util.Set;
import java.util.TreeSet;
class Person implements Comparable<Person> {
    private String name ;
    private Integer age ;
    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Person o) {
        if (this.age > o.age ) {
            return 1 ;
        }else if (this.age < o.age ){
            return -1 ;
        }else {

            return this.name.compareTo(o.name) ;
        }
    }
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
public class TreeSetTest {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>() ;
        set.add(new Person("张三",20)) ;
// 重复元素
        set.add(new Person("张三",20)) ;
        set.add(new Person("李四",20)) ;
        set.add(new Person("王五",19)) ;
        System.out.println(set) ;
    }
}