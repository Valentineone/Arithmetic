package www.homework.chapterfour.kfc.mykfc;

/**
 * @author wangchong
 * @date 2019/4/19 17:26
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Hamburger extends AbstractFood implements Food{
    @Override
    public void printInformation(){
        System.out.println("--"+this.kind+"  单价："+this.price+
                "  数量："+this.num+"  合计："+this.totalPrice());
    }

}
