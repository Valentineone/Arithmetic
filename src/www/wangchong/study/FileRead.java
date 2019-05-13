package www.wangchong.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("F:\\Program\\java\\IDEA\\Arithmetic\\src\\www\\homework\\chapter_3\\user.txt"));
        //input.useDelimiter("\r\n");
        while (input.hasNextLine()) {

            String str = input.nextLine();

            System.out.println(str);
        }

    }
}
