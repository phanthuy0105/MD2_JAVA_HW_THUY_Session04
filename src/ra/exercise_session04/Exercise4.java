package ra.exercise_session04;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /*
         * Nhập số dòng(row) và số cột(col) của mảng 2 chiểu
         * Khai báo mảng 2 chiều số nguyên gồm row dòng và col cột
         * */
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số dòng(row) và số cột(col) của mảng 2 chiểu
        System.out.println("Nhập vào số dòng của mảng 2 chiều:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng 2 chiều:");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arrNumbers = new int[row][col];

        // 2. Nhập giá trị các phần tử của mảng 2 chiều
        for (int i = 0; i < arrNumbers.length; i++) {
            for (int j = 0; j < arrNumbers[i].length; j++) {
                System.out.printf("numbers[%d][%d]=", i, j);
                arrNumbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Các phần tử trong mảng là:");
        for (int i = 0; i < arrNumbers.length; i++) {
            for (int j = 0; j < arrNumbers[i].length; j++) {
                System.out.printf("%5d", arrNumbers[i][j]);
            }
        }
        System.out.printf("\n");

        // Tìm ra phần tử lớn nhất trong mảng 2 chiều và in ra
        int max = arrNumbers[0][0];
        for (int i = 0; i < arrNumbers.length; i++) {
            for (int j = 0; j < arrNumbers[i].length; j++) {
                if (max < arrNumbers[i][j]) {
                    max = arrNumbers[i][j];
                }
            }
        }
        System.out.printf("\nSố lớn nhất trong mảng là: %d", max);
    }
}