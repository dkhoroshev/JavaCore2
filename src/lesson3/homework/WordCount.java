package lesson3.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) {
        String[] arr = {"привет", "пока", "hello", "trololo", "привет", "hello", "trololo", "привет","яйца","дверь","окно","Тумбочка","пока","привет","Дверь"};

        Set strSet = new HashSet();
        for (String str : arr) {
            strSet.add(str);
        }
        System.out.println("Уникальные элемены массива: " + strSet);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String str : arr) {
            int cnt = 0;
            for (String str1 : arr) {
                if (str.equals(str1)) {
                    cnt++;
                }
            }
            wordCount.put(str, cnt);
        }
        System.out.println("Подсчет повторяющихся слов - " + wordCount);

    }
}
