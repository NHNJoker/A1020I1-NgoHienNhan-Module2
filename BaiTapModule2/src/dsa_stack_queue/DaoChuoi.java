package dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class DaoChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String mWord = input.nextLine();
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.substring(i, (i + 1)));
        }
        mWord = "";
        while (wStack.size() > 0) {
            mWord += wStack.pop();
        }
        System.out.println(mWord);
    }
}
