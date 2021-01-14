package mangVaPhuongThuc;

import java.util.Scanner;

public class demSoLanXuatHienCuaCacKyTu {
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "ngoHienNhan";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            System.out.println("Ky tu " + str.charAt(i));
            for (int j = (i + 1); j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    str =removeCharAt(str,j);
                }
            }
            System.out.println(count);
        }
    }
}
