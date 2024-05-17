package ra.exercise_session04;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // 1. Khai báo và nhập giá trị các phần tử (n) của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int lengthArray = Integer.parseInt(scanner.nextLine());
        int[] arrNumbers = new int[lengthArray];

        // 2. Nhập giá trị các phần tử của mảng
        for (int i = 0; i < lengthArray; i++) {
            System.out.printf("Numbers[%d]=", i);
            arrNumbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //
        System.out.println("Mảng trước khi gộp phần tử:");
        for (int element : arrNumbers) {
            System.out.printf("%d\t", element);
        }
        System.out.printf("\n");

        // 3. Tìm giá trị nhỏ nhất trong mảng và in ra
        int min = arrNumbers[0];
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] < min) {
                min = arrNumbers[i];
            }
        }
        System.out.printf("\nSố nhỏ nhất trong mảng là: %d", min);
    }
}
