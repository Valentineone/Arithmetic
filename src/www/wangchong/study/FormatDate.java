package www.wangchong.study;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangchong
 * @date 2019/4/20 16:28
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class FormatDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }

}
