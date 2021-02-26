package mangVaPhuongThuc;

import java.util.Arrays;
import java.util.Scanner;

public class timPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so dong:");
        int row = input.nextInt();
        System.out.println("Nhap vao so cot:");
        int column = input.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhap vao gia tri dong " + i + " cot " + j + " :");
                int element = input.nextInt();
                arr[i][j] = element;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("so lon nhat trong mang la:" + max);
    }
}
