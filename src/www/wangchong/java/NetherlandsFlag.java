package www.wangchong.java;

public class NetherlandsFlag {
    public static int[] partition(int[] arr, int left, int right, int p) {
        int less = left - 1;
        int more = right + 1;
        while (left < more) {
            if(arr[left] < p) {
                swap(arr, left++,++less);
            } else if(arr[left] > p) {
                swap(arr,left,--more);
            } else {
                left++;
            }
        }
        return new int[] {less,more};
    }

    public static void swap(int[] arr, int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] generateRandomoArray() {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random() * 5);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        if(arr == null) {
            return;
        }
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = generateRandomoArray();
        System.out.println("Before:");
        printArray(arr);
        int[] res = partition(arr,0,arr.length - 1,3);

        System.out.println("After:");
        printArray(arr);

        System.out.println("site:");
        printArray(res);
    }
}

