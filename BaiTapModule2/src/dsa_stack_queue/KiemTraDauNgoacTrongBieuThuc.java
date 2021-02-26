package dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoacTrongBieuThuc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap bieu thuc:");
        String expression = input.nextLine();
        Stack<String> bStack = new Stack<>();
        Stack<String> left = new Stack<>();
        Boolean check = true;
        String bracketBefore="";
        for (int i = 0; i < expression.length(); i++) {
            String bChar = expression.substring(i, (i + 1));
            if (bChar.equals("(")) {
                bStack.push(bChar);
            }
            if (bChar.equals(")")) {
                if (bStack.isEmpty() || bracketBefore.equals(")")) {
                    System.out.println("Dau ngoac khong dung");
                    check = false;
                    break;
                } else {
                    left.push(bChar);
                }
            }
            bracketBefore = bChar;
        }
        if (check) {
            if (bStack.size() == left.size()) {
                System.out.println("Dau ngoac duoc dat dung");
            } else {
                System.out.println("Dau ngoac khong dung");
            }
        }
    }
}
