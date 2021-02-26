package dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenHeThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so he thap phan");
        int soThapPhan = input.nextInt();
        Stack<Integer> stackNhiPhan = new Stack<>();
        while (soThapPhan > 0) {
            stackNhiPhan.push((soThapPhan % 2));
            soThapPhan = soThapPhan / 2;
        }
        String soNhiPhan = "";
        while (!stackNhiPhan.isEmpty()) {
            soNhiPhan += stackNhiPhan.pop();
        }
        System.out.println(soNhiPhan);
    }
}
