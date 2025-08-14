import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №8");

        /**
         * 1) Вывести список
         * Создайте список из 5 целых чисел. Выведите его элементы через пробел.
         */
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arrayList.add(random.nextInt(100));
        }
        printWithSpace(arrayList);

        List<Integer> linkedList = new LinkedList<>(arrayList);
        linkedList.removeFirst();
        linkedList.addFirst(7);
        linkedList.removeLast();
        linkedList.addLast(42);
        linkedList.remove(2);
        linkedList.add(2, 7);
        printWithSpace(linkedList);

        /**
         * 2) Доступ по индексу
         * Выведите третий элемент списка
         */
        System.out.printf("Третий элемент = %s\n", arrayList.get(2));
        System.out.printf("Третий элемент = %s\n", linkedList.get(2));

        /**
         * 3) Удаление элемента
         * Удалите второй элемент списка и выведите оставшиеся
         */
        arrayList.remove(1);
        linkedList.remove(1);
        System.out.println(arrayList);
        System.out.println(linkedList);

        /**
         * 4) Сумма элементов
         * Найдите сумму всех чисел в списке
         */
        long sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        System.out.printf("Сумма элементов = %s\n", sum);

        /**
         * 5) Подсчёт количества
         * Подсчитайте, сколько раз в списке встречается число 7
         */
        System.out.printf("Число 7 в списке встречается %s раз\n", Collections.frequency(linkedList, 7));

        /**
         * 6) Поиск элемента
         * Проверьте, содержится ли число 42 в списке
         */
        if (arrayList.contains(42)) {
            System.out.println("Число 42 в списке есть");
        } else {
            System.out.println("Числа 42 в списке нет");
        }

        /**
         * 7) Минимум и максимум
         * Найдите и выведите минимальное и максимальное число в списке
         */
        System.out.printf("%s -минимальное, %s -максимальное число в списке\n",
                Collections.min(arrayList),
                Collections.max(arrayList));
        System.out.printf("%s -минимальное, %s -максимальное число в списке\n",
                Collections.min(linkedList),
                Collections.max(linkedList));
        Collections.sort(arrayList);
        System.out.printf("%s -минимальное, %s -максимальное число в списке\n",
                arrayList.getFirst(),
                arrayList.getLast());

        /**
         * 8) Удалить все чётные числа
         * Удалите из списка все числа, делящиеся на 2.
         */
        arrayList.removeIf(n -> n % 2 == 0);
        System.out.println(arrayList);

        /**
         * 9) Создание списка из массива
         * Создайте список из массива int[] arr = {1, 2, 3, 4}.
         */
        int[] arr = {1, 2, 3, 4};
        List<Integer> numbers = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        System.out.println(numbers);

        /**
         * 10) Количество элементов > N
         * Найдите количество элементов, больше чем число N
         */
        moreThanN(arrayList, 50);
        moreThanN(linkedList, 7);

        /**
         *11) Создание списка строк и фильтрация
         * Создайте список строк. Выведите строки, длина которых больше 5
         */
        List<String> stringList = new ArrayList<>();
        stringList.add("Айвазовский");
        stringList.add("Моне");
        stringList.add("Венецианов");
        stringList.add("Серов");
        stringList.add("Кустодиев");
        System.out.println(stringList);
        printLongerThanFive(stringList);

        /**
         *12) Инвертировать список
         * Напишите метод, который возвращает список в обратном порядке
         */
        Collections.reverse(stringList);
        System.out.println(stringList);

        /**
         *13) Объединение двух списков без дубликатов
         * Даны два списка. Объедините их в один, не добавляя повторы
         */
        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<String> list2 = new ArrayList<>(Arrays.asList("C", "D", "E", "F"));
        Set<String> set = new LinkedHashSet<>(list1);
        set.addAll(list2);
        System.out.println(set);

        /**
         *14) Сумма только нечётных чисел
         * Считайте List<Integer> и посчитайте сумму только нечётных чисел
         */
        sumOddNumbers(arrayList);
        sumOddNumbers(linkedList);

        /**
         *15) Фильтр по первой букве
         * Дан список строк. Верните новый список, содержащий только строки, начинающиеся с буквы "А"
         */
        System.out.println(listStartA(stringList));
    }

    public static void printWithSpace(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.getLast());
    }

    public static void moreThanN(List<Integer> list, int n) {
        int count = 0;
        for (Integer i : list) {
            if (i > n) {
                count++;
            }
        }
        System.out.printf("В списке %s элемент(ов), больше чем %s\n", count, n);
    }

    public static void printLongerThanFive(List<String> stringList) {
        for (String string : stringList) {
            if (string.length() > 5) {
                System.out.println(string);
            }
        }
    }

    private static void sumOddNumbers(List<Integer> arrayList) {
        long sum = 0;
        for (Integer i : arrayList) {
            if ((i % 2) != 0) {
                sum += i;
            }
        }
        System.out.printf("Сумма нечетных чисел = %s\n", sum);
    }

    public static List<String> listStartA(List<String> stringList) {
        List<String> resultList = new ArrayList<>();
        for (String string : stringList) {
            if (string.startsWith("А")) {
                resultList.add(string);
            }
        }
        return resultList;
    }
}