package www.homework.embarkationfournext.two;

/**
 * @author wangchong
 * @date 2019/4/29 9:27
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class MideaFactory implements AirConditionFactory {
    @Override
    public AirCondition createAriCondition() {
        return new Midea();
    }
}
