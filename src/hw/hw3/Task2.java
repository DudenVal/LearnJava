package hw.hw3;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
public class Task2 {
    public static void DelChetNum() {
        ArrayList<Integer> array = new ArrayList<>();
        array = lib.FillRandomArray(10);
        lib.PrintArray(array);
        DeleteNumber(array);
        lib.PrintArray(array);
    }
    public static void DeleteNumber(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
}