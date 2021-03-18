package string_regex;

import java.util.Scanner;

public class validateTenLop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap teen lop");
        String tenLop = input.nextLine();
        System.out.println(tenLop.matches("[CAP][0-9]{4}[GHIKLM]"));
    }
}
