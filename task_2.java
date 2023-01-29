package javaHomework3;

import java.util.ArrayList;

public class task_2 {
    // Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < 30; i++) {
            arr.add(i);
        for (int j = 0; j < arr.size(); j++) {
            if(arr.get(j) % 2 ==0){arr.remove(j);}
        }
        
        }
        System.out.println(arr);
    }
}
