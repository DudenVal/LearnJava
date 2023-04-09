
package tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tasksSem2 {
    private static final Logger LOG = Log.log(tasksSem2.class.getName());

//    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N,
//    которая состоит из чередующихся символов c1 и c2, начиная с c1.
    public static String Sem2Task1(int n, char a, char b) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= n / 2; i++) {
            str.append(a);
            str.append(b);
        }
        return str.toString();
    }

//        Напишите метод, который составит строку,
//        состоящую из 100 повторений слова TEST и метод,
//        который запишет эту строку в простой текстовый файл, обработайте исключения.
    public static String Sem2Task2() {
        return "TEST".repeat(100);
    }

    public static void writeInFile() {
        String str = Sem2Task2();
        try (FileWriter in = new FileWriter("test.txt")) {
            in.append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //    -----------------------------------------------------------------------
//  Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//  Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//  Обработайте ошибки с помощью try-catch конструкции.
//  В случае возникновения исключения, оно должно записаться в лог-файл.

    public static void write(String path) {
        try (FileWriter in = new FileWriter("task3.txt")) {
            String[] data= getFilesInFolders(path);
            for (String datum : data) {
                in.append(datum);
            }
            System.out.println("recorded! ");
//            throw new IOException("Error");   // насильная ошибка для проверки Log
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static String[] getFilesInFolders(String path) {
        File dir = new File(path);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName();
                    if (files[i].isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;

                }
            }
        } else {
            System.out.println((dir.getName() + " not a package"));
        }

        return result;
    }



}


