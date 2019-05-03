package www.homework.embarkationfournext.reflect;

/**
 * @author wangchong
 * @date 2019/4/29 8:56
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Client {
    public void buyCpu(CPU cpu) {
        cpu.printCpu();
    }
    public void buyRam(RAM ram) {
        ram.printRam();
    }
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Client client = new Client();
        IFactory macFactory = Factory.getInstance("www.homework.embarkationfournext.reflect.MacFactory");
        client.buyCpu(macFactory.createCpu());
        client.buyRam(macFactory.createRam());
       IFactory pcFactory = Factory.getInstance("www.homework.embarkationfournext.reflect.PcFactory");
        client.buyCpu(pcFactory.createCpu());
        client.buyRam(pcFactory.createRam());
    }
}
