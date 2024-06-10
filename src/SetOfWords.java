import java.util.*;
public class SetOfWords
{
    public static void main(String[] args) {
        String[] words = {"Красный", "Красный", "Синий", "Желтый", "Зеленый", "Зеленый", "Зеленый", "Белый", "Оранжевый", "Голубой"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        System.out.println("\nКоличество повторений:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

