package www.homework.embarkationfournext.reflect;

/**
 * @author wangchong
 * @date 2019/4/29 8:54
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Factory {
    public static IFactory getInstance(String classname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IFactory iFactory = (IFactory) Class.forName(classname).newInstance();
        return iFactory;
    }
}

