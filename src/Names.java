import java.util.*;
import java.util.stream.IntStream;

public class Names
{

    public static void main(String[] args) {

        String[] name = new String[]{"Красный", "Зеленый", "Красный", "Синий", "Желтый", "Голубой", "Зеленый", "Красный", "Белый", "Оранжевый"};

        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(name));
        System.out.println("Уникальные слова: " + uniqueWords);

        HashMap<String, Integer> wordCounts = new HashMap<>();

        IntStream.range(0, name.length).forEach(i -> {
            if (!wordCounts.containsKey(name[i]))
                wordCounts.put(name[i], 1);
            else
                wordCounts.put(name[i], wordCounts.get(name[i]) + 1);
        });

        System.out.println("Число повторений: " + wordCounts);
    }
}