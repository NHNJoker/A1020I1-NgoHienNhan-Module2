package mangVaPhuongThuc;

import sun.awt.geom.AreaOp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class xoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc mang: ");
        int arrSize = input.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu thu " + i + " vao mang: ");
            int valueArr = input.nextInt();
            arr[i] = valueArr;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap vao phan tu can xoa:");
        int valueX = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueX) {
                for (int j = i; j < arr.length; j++) {
                    if (j == (arr.length - 1)) {
                        arr[j] = 0;
                    }else {
                        arr[j] = arr[(j + 1)];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
