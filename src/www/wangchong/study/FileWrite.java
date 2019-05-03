package www.wangchong.study;

import java.io.*;
import java.util.Scanner;

/**
 *
 * File new的文件,没有则创建一个新的,有则就代表那个文件对象
 *
 * 要想换行必须加 \r\n
 *
 * FileWriter(,true) true带表追加
 * 有true的时候下一次运行会在后原有内容追加
 * 没true下一次运行会从文件最开始输入内容无论之前有多少内容,都是先将文件置空然后在写内容
 *
 * PrintStream 均是覆盖的
 *
 * */
public class FileWrite {
    public static void main(String[] args) throws IOException {
        File testFile = new File("F:\\test.txt");
        Writer writer = new FileWriter(testFile);
        int line = 3;
        while (line-- >= 0) {
            writer.write("test" + "\n");
        }
        writer.close();

        PrintStream printStream = new PrintStream(testFile);
        while (line++ < 3) {
            printStream.append("you");
        }
        printStream.close();

        Scanner fileScanner = new Scanner(testFile);
        System.out.println(fileScanner.nextLine());
    }
}
