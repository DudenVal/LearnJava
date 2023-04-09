package hw.hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
public class Task1 {
    public static void  addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)){
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item: map.entrySet()) {
            String phones = "";
            for (int el: item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 1415523, bookPhone);
        addNumber("Ivanov", 1232414, bookPhone);
        addNumber("Petrov", 5465285, bookPhone);
        addNumber("Harlamov", 8956477, bookPhone);
        addNumber("Ivanov", 12356233, bookPhone);
        addNumber("Petrov", 787897, bookPhone);
        printBook(bookPhone);
    }
}
