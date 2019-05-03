package www.homework.embarkationfournext.two;


/**
 * @author wangchong
 * @date 2019/4/29 9:24
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Client {
    public void buyAirCondition(AirCondition airCondition) {
        airCondition.printAirCondition();
    }

    public static void main(String[] args) {
        AirConditionFactory airConditionFactory = new HaierFactory();
        Client client = new Client();
        client.buyAirCondition(airConditionFactory.createAriCondition());
    }
}
