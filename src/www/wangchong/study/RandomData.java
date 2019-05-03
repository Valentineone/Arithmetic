package www.wangchong.study;

import java.util.ArrayList;

public class RandomData {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
            data.add(" 17408070101");
            data.add(" 17408070106");
            data.add(" 17408070108");
            data.add(" 17408070109");
            data.add(" 17408070202");
            data.add(" 17408070203");
            data.add(" 17408070207");
            data.add(" 17408070310");
            data.add(" 17408070409");
            data.add(" 17408070411");
            data.add(" 17408070605");
            data.add(" 17408070606");
            data.add(" 17408070803");
            data.add(" 17401010229");
            data.add(" 17407110333");
            data.add(" 17408070212");
            data.add(" 17408070233");
            data.add(" 17408070312");
            data.add(" 17408070415");
            data.add(" 17408070430");
            data.add(" 17408070714");
            data.add(" 17408070726");
            data.add(" 17408070728");
            data.add(" 17408070813");
            data.add(" 17408070814");
            data.add(" 17408070828");
            data.add(" 17408070924");
            data.add(" 17409060125");
            data.add(" 17411070330");
            data.add(" 17408070401");
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 15; i++) {
            while (true) {
                int random = (int) (Math.random() * 30);
                if (!arrayList.contains(random)) {
                    arrayList.add(random);
                    break;
                }
            }
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(data.get(arrayList.get(i)));
        }
    }
}
