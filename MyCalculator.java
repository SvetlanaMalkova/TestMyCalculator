package test;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение (например: 1 + 3): ");
        String input = scanner.nextLine();

        String result = calc(input);
        System.out.println("Результат: " + result);
    }
    public static String calc(String input) {
        input = input.trim();
        String[] parts = input.split(" ");

        if (parts.length != 3) {
            return "Ошибка: Неверный формат. Используйте: a оператор b";
        }
        int a = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int b = Integer.parseInt(parts[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            return "Ошибка: Числа должны быть от 1 до 10 включительно.";
        }

        int result;

        if (operator.equals("+")) {
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        } else if (operator.equals("*")) {
            result = a * b;
        } else if (operator.equals("/")) {
            if (b == 0) {
                return "Ошибка: Деление на ноль недопустимо.";
            }
            result = a / b;
        } else {
            return "Ошибка: Неверный оператор. Используйте: +, -, *, /";
        }
        return String.valueOf(result);
    }
}

