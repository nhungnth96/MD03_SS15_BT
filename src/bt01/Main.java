package bt01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int sum = 0;
        try {
            sum = addition();
        } catch (InputMismatchException e){
            System.out.println("Số vừa nhập không phải số nguyên, hãy nhập lại");
            sum = addition();
        }
        System.out.println(sum);
    }
    public static int addition(){
        System.out.println("Nhập vào a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào b: ");
        int b = new Scanner(System.in).nextInt();
        return a+b;
    }
}
