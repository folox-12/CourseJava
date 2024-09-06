package lessons.level.second.third;

import java.util.*;

/*
1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 Посчитать, сколько раз встречается каждое слово.
2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи,
 а с помощью метода get() искать номер телефона по фамилии.
 Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 тогда при запросе такой фамилии должны выводиться все телефоны.
 Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
 взаимодействие с пользователем через консоль и т.д).
 Консоль использовать только для вывода результатов проверки телефонного справочника.
 */
public class App {
    public static void main(String[] args) {
        // 1
        String[] wordsArray = new String[]{
                "яблоко", "груша", "банан", "вишня",
                "клубника", "арбуз", "дыня", "персик",
                "слива", "гранат", "киви", "лимон",
                "апельсин", "мандарин", "яблоко", "малина",
                "ежевика", "смородина", "черника", "земляника"
        };

        List<String> words = new ArrayList(Arrays.asList(wordsArray));

        Set<String> uniqueWords = new HashSet<>(words);
//        System.out.println("Уникальные слова = " + uniqueWords);

        Map<String, Integer> wordsCount = new HashMap<>();

        for (String word : words) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
//        System.out.println(wordsCount);

        //2
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("Ivanov", "8_888_888_88_88");
        telephoneBook.add("Ivanov", "7_888_888_88_88");
        telephoneBook.add("Petrov", "7_888_888_88_88");

        List ivanovsTelephone = telephoneBook.get("Ivanov");

        System.out.println(ivanovsTelephone);
    }
}
