public class main {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        boolean check = true;
        while (count <= 20) {
            check = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}