package dsa_stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ToChucDuLieu {
    public static void demergingQueue(ArrayList<String> employee){
        Queue<String> NU = new LinkedList<>();
        Queue<String> NAM = new LinkedList<>();
        for (String string:employee) {
            if (employee.get(1).equals("Nu")){
                NU.offer(String.valueOf(employee));
            }
            if (employee.get(1).equals("Nam")){
                NAM.offer(String.valueOf(employee));
            }
        }
        while (!NU.isEmpty()){

        }
    }
}
