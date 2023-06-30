package bt03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào độ dài mảng: ");
        int size = new Scanner(System.in).nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            try {
                System.out.println("Nhập vào phần tử thứ "+(i+1));
                arr[i] = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e){
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static int getInteger() {

            try {
                return new Scanner(System.in).nextInt();
            } catch (NumberFormatException e) {
                System.err.println("Giá trị phải là số nguyên");
            }
        return getInteger();
    }
}
