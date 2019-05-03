package www.wangchong.study.factory.abstractfactory;

/**
 * @author wangchong
 * @date 2019/4/28 17:31
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
interface OperatingSystem {
    void printSystem();
}
class MacOsSystem implements OperatingSystem {
    @Override
    public void printSystem() {
        System.out.println("This is a mac os");
    }
}
class Windows8System implements OperatingSystem {
    @Override
    public void printSystem() {
        System.out.println("This is a window 8");
    }
}
interface ProductionFactory {
    Computer createComputer();
    OperatingSystem createSystem();
}
class AppleFactory implements ProductionFactory {
    @Override
    public Computer createComputer() {
        return new MacbookProComputer();
    }
    @Override
    public OperatingSystem createSystem() {
        return new MacOsSystem();
    }
}
class MsFactory implements ProductionFactory {
    @Override
    public Computer createComputer() {
        return new SurfaceBookComputer();
    }
    @Override
    public OperatingSystem createSystem() {
        return new Windows8System();
    }
}

public class Client {
    public void buyComputer(Computer computer) {
        computer.printComputer();
    }
    public void use(OperatingSystem s) {
        s.printSystem();
    }
    public static void main(String[] args) {
        Client client = new Client();
        ProductionFactory factory = new AppleFactory();
        client.buyComputer(factory.createComputer());
        client.use(factory.createSystem());
    }
}