package mangVaPhuongThuc;

import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao gia do dai cua mang a:");
        int lengthArrA = input.nextInt();
        int[] arrA = new int[lengthArrA];
        for (int i = 0; i<arrA.length; i++){
            System.out.println("nhap vao phan tu thu "+i);
            int elementArr = input.nextInt();
            arrA[i] = elementArr;
        }
        System.out.println("Nhap vao gia do dai cua mang b:");
        int lengthArrB = input.nextInt();
        int[] arrB = new int[lengthArrB];
        for (int i = 0; i<arrB.length; i++){
            System.out.println("nhap vao phan tu thu "+i);
            int elementArr = input.nextInt();
            arrB[i] = elementArr;
        }
        int[] arrC = new int[arrA.length+arrB.length];
        for (int i =0;i<arrA.length;i++){
            arrC[i]=arrA[i];
        }
        int j = 0;
        for (int i =(arrA.length);i<arrC.length;i++){
            arrC[i]=arrB[j];
            j++;
        }
        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));
        System.out.println(Arrays.toString(arrC));
    }
}
