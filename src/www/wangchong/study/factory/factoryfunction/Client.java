package www.wangchong.study.factory.factoryfunction;

/**
 * @author wangchong
 * @date 2019/4/28 16:30
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
interface Computer {
    void printComputer();
}
class MacbookProComputer implements Computer {
    @Override
    public void printComputer() {

        System.out.println("This is a MacbookPro");
    }
}
class SurfaceBookComputer implements Computer {
    @Override
    public void printComputer() {
        System.out.println("This is a SurfaceBook");
    }
}
interface ComputerFactory {
    Computer createComputer();
}
class MsFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new SurfaceBookComputer();
    }
}
class AppleFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }
}
public class Client {
    public void buyComputer(Computer computer) {
        computer.printComputer();
    }
    public static void main(String[] args) {
        Client client = new Client();
        ComputerFactory factory = new AppleFactory();
        client.buyComputer(factory.createComputer());
    }
}