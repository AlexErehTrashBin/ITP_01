package ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task01;

import java.util.Locale;
import java.util.Scanner;

/**
* Для вычислений использовать отдельные функции (методы). Не использовать глобальные
* переменные, все необходимые данные передавать в эти функции (методы).
* <p>
* <b>(*) Даны различных целых 3 числа. Выбрать из этих чисел среднее по значению
* (например, для чисел 8, 5, 100 правильным ответом будет 8). Числа вводятся в
* произвольном порядке. Использовать методы Math.Min(...) и Math.Max(...), условный
* оператор использовать нельзя, только присваивания.</b>
* */
public class Program {
    /**
     * Метод для получения медианного (находящее посередине в отсортированном списке)
     * значения трёх чисел.
     */
    private static int getMedian(int a, int b, int c){
        int max = Math.max(Math.max(a, b), c); // Максимальное трёх чисел
        int min = Math.min(Math.min(a, b), c); // Минимальное трёх чисел
        return a + b + c - max - min;
    }

    // Метод для безопасного чтения целого числа из консоли.
    private static int readIntValueFromConsole(String varName){
        while (true) {
            System.out.printf("Введите %s: ", varName);

            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            try {
                return Integer.parseInt(str);
            } catch (Exception e) {
                System.out.printf("\"%s\" - не целое число. Попробуйте снова.%n", str);
            }
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int num1 = readIntValueFromConsole("первое число");
        int num2 = readIntValueFromConsole("второе число");
        int num3 = readIntValueFromConsole("третье число");

        System.out.printf("Медианное значение: %d", getMedian(num1, num2, num3));
    }
}
