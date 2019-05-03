package www.homework.embarkationfournext.one;

import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/29 9:16
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Woman implements Person{

    @Override
    public void printPerson() {
        System.out.println("new a woman");
    }

    /**
     * @author wangchong
     * @date 2019/4/29 9:12
     * @email 876459397@qq.com
     * @CSDN https://blog.csdn.net/wfcn_zyq
     * @describe
     */
    public static class NewPerson {
        public  void newPerson(Person person) {
            person.printPerson();
        }

        public static void main(String[] args) {
            NewPerson newPerson = new NewPerson();
            Scanner input = new Scanner(System.in);
            String type = input.nextLine();
            Person person = Nvwa.getInstance(type);
            newPerson.newPerson(person);
        }
    }
}
