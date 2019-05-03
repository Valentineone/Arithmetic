package www.wangchong.study;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 用Scanner比较好
 */
public class FileReadEachLine {
    public static String txt2String(File file) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                result.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        File file = new File("F:/card.txt");//我的txt文本存放目录，根据自己的路径修改即可
        System.out.println(txt2String(file));
    }
}
