package test;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение (например: 1+3): ");
        String input = scanner.nextLine();

        String result = calc(input);
        System.out.println("Результат: " + result);
    }

    public static String calc(String input) {
        if (input.length() < 3) {
            return "Ошибка: Неверный формат. Используйте: aоператорb";
        }

        char operator = input.charAt(1);
        int a = Character.getNumericValue(input.charAt(0));
        int b = Character.getNumericValue(input.charAt(2));

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            return "Ошибка: Числа должны быть от 1 до 10 включительно.";
        }

        int result;

        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else {
            return "Ошибка: Неверный оператор. Используйте: +, -, *, /";
        }

        return String.valueOf(result);
    }
}

