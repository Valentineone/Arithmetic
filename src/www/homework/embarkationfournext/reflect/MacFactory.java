package www.homework.embarkationfournext.reflect;


/**
 * @author wangchong
 * @date 2019/4/29 8:52
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class MacFactory implements IFactory {
    @Override
    public CPU createCpu() {
        return new MacCpu();
    }

    @Override
    public RAM createRam() {
        return new MacRam();
    }
}
