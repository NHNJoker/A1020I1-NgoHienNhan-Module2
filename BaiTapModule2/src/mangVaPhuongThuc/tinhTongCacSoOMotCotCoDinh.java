package mangVaPhuongThuc;

import java.util.Arrays;
import java.util.Scanner;

public class tinhTongCacSoOMotCotCoDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so dong cua mang:");
        int row = input.nextInt();
        System.out.println("Nhap so cot cua mang:");
        int column = input.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap phan tu dong " + i + " cot " + j);
                int element = input.nextInt();
                arr[i][j] = element;
            }
        }
        System.out.println("Nhap cot muon tinh tong:");
        int sumElementCol = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][sumElementCol];
        }
        System.out.println("Tong la:" + sum);
    }
}
