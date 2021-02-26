package dsa_stack_queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoMangSoNguyen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so kich thuoc mang so nguyen");
        int lengthArr = input.nextInt();
        int[] arrSoNguyen = new int[lengthArr];

        for (int i = 0; i < arrSoNguyen.length; i++) {
            System.out.println("Nhap so nguyen:");
            arrSoNguyen[i] = input.nextInt();
        }
        System.out.println("befor:"+ Arrays.toString(arrSoNguyen));
        Stack<Integer> soNguyenStack = new Stack<>();
        for (int value : arrSoNguyen) {
            soNguyenStack.push(value);
        }
        int i = 0;
        while (soNguyenStack.size()>0){
            arrSoNguyen[i]=soNguyenStack.pop();
            i++;
        }
        System.out.println("after:"+ Arrays.toString(arrSoNguyen));
    }
}
