
package ra.exercise_session04;

import java.util.Scanner;

public class Example02_Tonghop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng 2 chiều:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng 2 chiều:");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] oldArray = new int[row][col];
        do {
            System.out.println("**************MENU*************");
            System.out.println("1. Nhập giá trị các phần tử của mảng)");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng\n");
            System.out.println("4. In các phần tử và tổng các phần tử nằm trên đường biên,\n" +
                    "đường chéo chính và đường chéo phụ)");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử\n" +
                    "tăng dần theo cột của mảng");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các\n" +
                    "phần tử trên đường chéo chính của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng\n" +
                    "muốn chèn vào mảng, thực hiện chèn vào mảng 2 chiều\n");
            System.out.println("9. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào giá trị phần tử của mảng: ");
                    for (int i = 0; i < oldArray.length; i++) {
                        for (int j = 0; j < oldArray[i].length; j++) {
                            System.out.printf("oldArray[%d][%d]=", i, j);
                            oldArray[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng: ");
                    for (int i = 0; i < oldArray.length; i++) {
                        for (int j = 0; j < oldArray[i].length; j++) {
                            System.out.printf("%8d", oldArray[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    System.out.println("Số lượng phần tử chia hết cho 2 và 3 trong mảng: ");
                    for (int i = 0; i < oldArray.length; i++) {
                        for (int j = 0; j < oldArray[i].length; j++) {
                            if (oldArray[i][j] % 2 == 0) {
                                System.out.printf("Số lượng phần tử chia hết cho 2 là: %5d\n", oldArray[i][j]);
                            } else if (oldArray[i][j] % 3 == 0) {
                                System.out.printf("Số lượng phần tử chia hết cho 3 là: %5d\n", oldArray[i][j]);
                            }
                        }
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Các số nguyên tố trong mảng là:");
                    for (int i = 0; i < oldArray.length; i++) {
                        for (int j = 0; j < oldArray[i].length; j++) {
                            //i có phải là số nguyên tố hay không
                            boolean isPrime = true; //true là số nguyên tố - false không phải số nguyên tố
                            for (int m = 2; m <= Math.sqrt(i); m++) {
                                for (int n = 2; n <= Math.sqrt(j); n++) {
                                    if (oldArray[i][j] % oldArray[m][n] == 0) {
                                        //m,n là ước của i,j (m, n khác 1 và i, j) --> i,j không phải là số nguyên tố
                                        isPrime = false;
                                        break;
                                    }
                                }
                            }
                            if (isPrime) {
                                //i là số nguyên tố
                                System.out.printf("%d\t", i, j);
                            }
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Nhập vào giá trị phần tử của mảng cần chèn:");
                    int[] addArray = new int[col];
                    for(int i = 0;i < addArray.length; i++) {
                        System.out.printf("addArray[%d] = ", i);
                        addArray[i] = Integer.parseInt(scanner.nextLine());
                    }

                    System.out.println("Nhập vào chỉ số dòng cần chèn:");
                    int lineInsert = Integer.parseInt(scanner.nextLine());

                    int[][] newArray = new int[row + 1][col];
                    //Copy các phần tử cũ và chèn phần tử vào mảng mới
                    if (lineInsert < 0 || lineInsert >= oldArray.length) {
                        System.err.println("Chỉ số phần tử cần chèn không tồn tại");
                    } else {
                        for (int i = 0; i <= oldArray.length; i++) {
                            if (i < lineInsert) {
                                newArray[i] = oldArray[i];
                            } else if (i == lineInsert) {
                                newArray[i] = addArray;
                            } else {
                                newArray[i] = oldArray[i - 1];
                            }
                        }
                    }
                    System.out.println("Mảng sau khi chèn phần tử:");
                    for (int i = 0; i < newArray.length; i++) {
                        for (int j = 0; j < newArray[i].length; j++) {
                            System.out.printf("%d\t", newArray[i][j]);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-9");
            }
        } while (true);
    }
}
