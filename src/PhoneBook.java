import java.util.*;

public class PhoneBook {

    private Map<String, String[]> phoneNumbers;

    public PhoneBook() {
        phoneNumbers = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneNumbers.containsKey(lastName)) {
            
            String[] existingNumbers = phoneNumbers.get(lastName);
            String[] newNumbers = Arrays.copyOf(existingNumbers, existingNumbers.length + 1); 
            
            newNumbers[existingNumbers.length] = phoneNumber;
            phoneNumbers.put(lastName, newNumbers);
        } else {
            
            phoneNumbers.put(lastName, new String[]{phoneNumber});
        }
    }

    public String[] get(String lastName) {
        return phoneNumbers.getOrDefault(lastName, new String[0]); 
    }

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Иванов", "123-456-7890");
        book.add("Петров", "987-654-3210");
        book.add("Иванов", "555-123-4567");
        book.add("Сидоров", "111-222-3333");

        String[] numbersIvanov = book.get("Иванов");
        System.out.println("Телефонные номера для Иванов:");
        for (String number : numbersIvanov) {
            System.out.println(number);
        }

        String[] numbersPetrov = book.get("Петров");
        System.out.println("\nТелефонные номера для Петров:");
        for (String number : numbersPetrov) {
            System.out.println(number);
        }

        String[] numbersSidorov = book.get("Сидоров");
        System.out.println("\nТелефонные номера для Сидоров:");
        for (String number : numbersSidorov) {
            System.out.println(number);
        }

    }
}
