package colection_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> num = new LinkedList<>();
        num.offer(1);
        num.offer(2);
        num.offer(3);
        num.offer(4);
        num.offer(5);
        System.out.println("Nhap vao so luot choi:");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=2;j++) {
                num.offer(num.peek());
            }
            num.poll();
        }
        System.out.println(num.toString());
        System.out.println(num.peek());
    }
}
