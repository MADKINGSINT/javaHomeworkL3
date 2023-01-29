package javaHomework3;

import java.util.ArrayList;
import java.util.Collections;

public class task_3 {
    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 1; i < 30+1; i++) {
            arr.add(i);
        }
        int max = Collections.max(arr);
        int min = Collections.min(arr);
        int sum = 0;
        for (int index = 0; index < arr.size(); index++) {
            sum = sum + arr.get(index);
            
        }
        int SrAr = sum / arr.size();
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Среднее арифметическое = " + SrAr);
        }
   
}
