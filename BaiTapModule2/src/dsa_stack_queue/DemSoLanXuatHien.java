package dsa_stack_queue;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String chuoi = input.nextLine();
        chuoi.toUpperCase();
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < chuoi.length(); i++) {
            String charKey = chuoi.substring(i,(i+1));
            Set<String> keySet = map.keySet();
            for (String key: keySet){
                if (charKey == key){
                    map.put()
                }
            }
        }
    }
}
