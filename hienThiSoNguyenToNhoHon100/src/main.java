public class main {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        boolean check = true;
        while (num < 100) {
            check = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check =false;
                    break;
                }
            }
            if (check){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
