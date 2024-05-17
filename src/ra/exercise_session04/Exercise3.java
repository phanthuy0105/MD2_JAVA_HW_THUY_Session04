package ra.exercise_session04;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //input: oldArrayFirst [1,2,5,6,9]: 5 phần tử, oldArrayTwo [8,3,7]: 3 phần tử
        //output: newArray [1,2,5,6,9,8,3,7]: 8 phần tử
        /*
         * 1. Nhập số phần tử mảng(n) và khai báo mảng số nguyên
         * 2. Nhập giá trị các phần tử của mảng
         * 3. Tạo mảng mới, gộp mảng và in ra màn hình
         * */
        //1. Nhập số phần tử của mảng 1 và mảng 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int lengthArrayFirst = Integer.parseInt(scanner.nextLine());
        int[] oldArrayFirst = new int[lengthArrayFirst];

        // - Nhập giá trị các phần tử của mảng 1
        for (int i = 0; i < lengthArrayFirst; i++) {
            System.out.printf("oldNumber[%d]=", i);
            oldArrayFirst[i] = Integer.parseInt(scanner.nextLine());
        }
        //
        System.out.println("Mảng 1 trước khi gộp phần tử:");
        for (int element : oldArrayFirst) {
            System.out.printf("%d\t", element);
        }
        System.out.printf("\n");

        System.out.println("Nhập vào số phần tử của mảng:");
        int lengthArrayTwo = Integer.parseInt(scanner.nextLine());
        int[] oldArrayTwo = new int[lengthArrayTwo];

        // - Nhập giá trị các phần tử của mảng 2
        for (int i = 0; i < lengthArrayTwo; i++) {
            System.out.printf("oldArrayTwo[%d]=", i);
            oldArrayTwo[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng 2 trước khi gộp phần tử:");
        for (int element : oldArrayTwo) {
            System.out.printf("%d\t", element);
        }
        System.out.printf("\n");

        //3. Tạo mảng mới khi gộp và in ra màn hình
        int[] newArray = new int[lengthArrayFirst + lengthArrayTwo];
        for (int i = 0; i < lengthArrayFirst; i++) {
            newArray[i] = oldArrayFirst[i];
        }
        for (int i = 0; i < lengthArrayTwo; i++) {
            newArray[lengthArrayFirst + i] = oldArrayTwo[i];
        }
        System.out.println("Mảng sau khi gộp phần tử:");
        for (int element : newArray) {
            System.out.printf("%d\t", element);
        }
        System.out.printf("\n");
    }
}