
package ra.exercise_session04;

import java.util.Scanner;

public class Example01_Tonghop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int lengthArray = Integer.parseInt(scanner.nextLine());
        int[] oldArray = new int[lengthArray];
        do {
            System.out.println("**************MENU*************");
            System.out.println("1. Nhập giá trị n phần tử của mảng (n nhập từ bàn phím)");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (>0) trong mảng\n");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k\n" +
                    "trong mảng (k nhập từ bàn phím)");
            System.out.println("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng\n" +
                    "dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần,\n" +
                    "các phần tử còn lại ở giữa mảng theo thứ tự tăng dần\n");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm\n" +
                    "dần) đúng vị trí");
            System.out.println("9. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào giá trị phần tử của mảng");
                    for (int i = 0; i < lengthArray; i++) {
                        System.out.printf("oldArray[%d]=", i);
                        oldArray[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng");
                    for (int element : oldArray) {
                        System.out.printf("%d\t", element);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Trung bình các phần tử dương (>0) trong mảng");
                    double total = 0;
                    int count = 0;
                    for (int i = 0; i < lengthArray; i++) {
                        if (oldArray[i] > 0) {
                            total += oldArray[i];
                            count++;
                        }
                    }
                    double average = total / (double) count;
                    System.out.printf("Kết quả là: %.2f", average);
                    System.out.printf("\n");
                    break;
                case 4:
                    System.out.println("Nhập vào giá trị phần tử trong mảng:");
                    int k = Integer.parseInt(scanner.nextLine());

                    int isIndex = -1;
                    for (int i = 0; i < lengthArray; i++) {
                        if (oldArray[i] == k) {
                            isIndex = i;
                        }
                    }
                    if (isIndex > -1) {
                        System.out.printf("Chỉ số của phần tử là: %d", isIndex);
                    } else {
                        System.err.println("Phần tử không tồn tại trong mảng");
                    }
                    System.out.printf("\n");
                    break;
                case 5:
                    System.out.println("Sắp xếp nổi bọt sắp xếp mảng giảm dần\n");
                    System.out.println("Mảng trước khi sắp xếp:");
                    for (int number : oldArray) {
                        System.out.printf("%d\t", number);
                    }
                    System.out.printf("\n");
                    for (int i = 0; i < lengthArray - 1; i++) {
                        for (int j = 0; j < lengthArray - i - 1; j++) {
                            if (oldArray[j] < oldArray[j + 1]) {
                                // hoán đổi 2 phần tử
                                int temp = oldArray[j];
                                oldArray[j] = oldArray[j + 1];
                                oldArray[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Mảng sau khi sắp xếp giảm dần:");
                    for (int number : oldArray) {
                        System.out.printf("%d\t", number);
                    }
                    System.out.printf("\n");
                    break;
                case 6:
                    System.out.println("Các số nguyên tố trong mảng là:");
                    for (int i = 2; i <= lengthArray; i++) {
                        //i có phải là số nguyên tố hay không
                        boolean isPrime = true; //true là số nguyên tố - false không phải số nguyên tố
                        for (int j = 2; j <= Math.sqrt(i); j++) {
                            if (i % j == 0) {
                                //j là ước của i (j khác 1 và i) --> i không phải là số nguyên tố
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            //i là số nguyên tố
                            System.out.printf("%d\t", i);
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Nhập vào giá trị phần tử cần chèn:");
                    int element = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào chỉ số cần chèn:");
                    int indexInsert = Integer.parseInt(scanner.nextLine());
                    int[] newArray = new int[lengthArray + 1];
                    //Copy các phần tử cũ và chèn phần tử vào mảng mới
                    if (indexInsert < 0 || indexInsert >= lengthArray) {
                        System.err.println("Chỉ số phần tử cần chèn không tồn tại");
                    } else {
                        for (int i = 0; i <= lengthArray; i++) {
                            if (i < indexInsert) {
                                newArray[i] = oldArray[i];
                            } else if (i == indexInsert) {
                                newArray[i] = element;
                            } else {
                                newArray[i] = oldArray[i-1];
                            }
                        }
                    }
                    System.out.println("Mảng mới trước khi sắp xếp:");
                    for (int number : newArray) {
                        System.out.printf("%d\t", number);
                    }
                    System.out.printf("\n");
                    for (int i = 0; i < newArray.length - 1; i++) {
                        for (int j = 0; j < newArray.length - i - 1; j++) {
                            if (newArray[j] < newArray[j + 1]) {
                                // hoán đổi 2 phần tử
                                int temp = newArray[j];
                                newArray[j] = newArray[j + 1];
                                newArray[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Mảng mới sau khi sắp xếp giảm dần:");
                    for (int number : newArray) {
                        System.out.printf("%d\t", number);
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
