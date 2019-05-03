//package www.lanqiao.java;
//
//import java.util.HashMap;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//
//    public static boolean isEqual(HashMap<Character,Character> map,char value) {
//        if (map.get(value) == value) {
//                return true;
//            }
//            return false;
//        }
//        public static void enQueue(Queue<Character> queue,String str) {
//            char[] arr = str.toCharArray();
//            for (int i = 0; i < str.length(); i++) {
//                queue.add(arr[i]);
//            }
//        }
//
//        public static void operate(Stack<Character> stack, Queue<Character> queue,char value) {
//            char po = stack.pop();
//            do {
//                queue.add(po);
//        }while (po != value);
//    }
//
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String aStr = input.next();
//        String bStr = input.next();
//        Queue<Character> AQ;
//        Queue<Character> BQ;
//        enQueue(AQ,aStr);
//        enQueue(BQ,bStr);
//        boolean aBool = true;
//        boolean bBool = true;
//        Stack<Character> stack;
//        HashMap<Character,Character> map = new HashMap<>();
//        do {
//            char aCh = AQ.poll();
//            while (isEqual(map,aCh)) {
//                operate(stack,AQ,aCh);
//                aCh = AQ.poll();
//            }
//            stack.push(aCh);
//            if (AQ.size() == 0) {
//                aBool = false;
//            }
//            map.put(aCh,aCh);
//            char bCh = BQ.poll();
//            while (isEqual(map,aCh)) {
//                operate(stack,BQ,bCh);
//            }
//            stack.push(BQ.poll());
//            if (BQ.size() == 0) {
//                bBool = false;
//                break;
//            }
//            map.put(bCh,bCh);
//
//        }while(true);
//    }
//}
