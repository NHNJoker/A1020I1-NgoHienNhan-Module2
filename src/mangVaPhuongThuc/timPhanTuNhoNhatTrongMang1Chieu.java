package mangVaPhuongThuc;

import java.util.Scanner;

public class timPhanTuNhoNhatTrongMang1Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu dai mang:");
        int length = input.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao phan tu thu " + i);
            int element = input.nextInt();
            arr[i] = element;
        }
    }
}
