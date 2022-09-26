package org.example;

public class BubbleSort {

    public static void buttleSort(int[] data) {
        System.out.println("开始排序");

        int arrayLength = data.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                    flag = true;
                }
            }

            System.out.println(java.util.Arrays.toString(data));

            if(!flag)
                break;
        }
    }

    public static void main(String[] args) {

        int[] data = {9, -22, 3, 54, 2, 1, 5, 6};

        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));

        buttleSort(data);

        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }
}
