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
        String[] arrWord = chuoi.split("\\s+");
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put(arrWord[0], 1);
        for (int i = 1; i < arrWord.length; i++) {
            String keyWord = arrWord[i];
            keyWord.trim();
            int flag = 0;
            Set<String> keySet = map.keySet();
            for (String key : keySet) {
                if (keyWord.equals(key)) {
                    map.put(keyWord, (map.get(keyWord) + 1));
                    flag ++;
                }
            }
            if (flag == 0) {
                map.put(keyWord, 1);
            }
        }
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println("Key:" + key + ":" + map.get(key));
        }
    }
}
