package mangVaPhuongThuc;

import java.util.Arrays;
import java.util.Scanner;

public class themPhanTuTrongMang {
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
        System.out.println("Nhap gia tri phan tu can chen:");
        int newElementArray = input.nextInt();
        System.out.println("Nhap vi tri muon chen:");
        int indexArr = input.nextInt();
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        if (indexArr <= 1 || indexArr >= (arr.length - 1)) {
            System.out.println("Khong chen duoc");
        } else {

            for (int i = (newArr.length - 1); i >= indexArr; i--) {
                newArr[i] = newArr[(i - 1)];
            }
            newArr[indexArr] = newElementArray;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
