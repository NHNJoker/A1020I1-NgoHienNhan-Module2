package dsa_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class KiemTraChuoiPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean check = true;
        System.out.println("Nhap chuoi:");
        String chuoi = input.nextLine();
        Stack<String> chuoiStack = new Stack<>();
        Queue<String> chuoiQueue = new LinkedList<>();
        for (int i = 0; i < chuoi.length(); i++) {
            chuoiStack.push(chuoi.substring(i,(i+1)));
            chuoiQueue.add(chuoi.substring(i,(i+1)));
        }
        while (!chuoiQueue.isEmpty()){
            String charStack = chuoiStack.pop();
            String charQueue = chuoiQueue.poll();
            if (!charQueue.equals(charStack)){
                System.out.println(chuoi+" khong phai la chuoi Palindrome.");
                check = false;
                break;
            }
        }
        if (check){
            System.out.println(chuoi+" la chuoi Palindrome.");
        }
    }
}
