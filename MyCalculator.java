package test;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение (например: 2 + 3): ");
        String input = scanner.nextLine();

        String result = calc(input);
        System.out.println("Результат: " + result);
    }
    public static String calc(String input) {
        input = input.trim();
        String[] parts = input.split(" ");

        if (parts.length != 3) {
            throw new IllegalArgumentException ("Оформат математической операции не удовлетворяет заданию. Используйте: a оператор b");
        }
        int a = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int b = Integer.parseInt(parts[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException ("Ошибка: Числа должны быть от 1 до 10 включительно.");
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
                throw new IllegalArgumentException ("Ошибка: Деление на ноль недопустимо.");
            }
            result = a / b;
        } else {
            throw new IllegalArgumentException ("Ошибка: Неверный оператор. Используйте: +, -, *, /");
        }
        return String.valueOf(result);
    }
}

