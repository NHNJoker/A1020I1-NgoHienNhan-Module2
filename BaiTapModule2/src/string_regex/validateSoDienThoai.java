package string_regex;

import java.util.Scanner;

public class validateSoDienThoai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so dien thoai:");
        String soDienThoai = input.nextLine();
        System.out.println(soDienThoai.matches("[(][\\d]{2}[)][(]0[\\d]{9}[)]"));
    }
}
