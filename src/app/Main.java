package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Створюємо сканер
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n1. Введіть ціле число: ");
        int number = scanner.nextInt();

        System.out.println("Квадрат числа " + number + " дорівнює " + calculateSquare(number));

        System.out.print("\n2. Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();

        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();

        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height +
                " дорівнює " + calculateVolCylinder(radius, height));

        int [] numbers = new int[] {11, 33, 23, 56, 75};

        System.out.println("\n3. Масив чисел: " + Arrays.toString(numbers) +
                "\nСума всіх елементів масиву дорівнює " + sumArray(numbers));

        scanner.nextLine();

        System.out.print("\n4. Введіть рядок: ");
        String line = scanner.nextLine();
        String reversed = reverseLine(line);

        System.out.println("Рядок в зворотньому порядку: " + reversed);

        System.out.print("\n5. Введіть число a: ");
        int a = scanner.nextInt();

        System.out.print("Введіть число b: ");
        int b = scanner.nextInt();

        System.out.println("Результат " + a + "^" + b + " дорівнює " + exponentiationNumber(a, b));

        System.out.print("\n6. Введіть ціле число: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();

        writeLines(text, quantity);
    }

    // 1. Метод обчислення квадрата числа
    public static int calculateSquare (int number) {
        return number * number;
    }

    // 2. Метод обчислення площі циліндра
    public static double calculateVolCylinder (double radius, double height) {
        double pi = Math.PI;
        return pi * radius * radius * height;
    }

    // 3. Метод обчислення суми значень в масиві
    public static int sumArray (int [] numbers) {

        int sum = 0;
        for (int number : numbers)
            sum += number;
        return sum;
    }

    // 4. Метод для реверсу рядку
    public static String reverseLine (String line) {

        String sumReversLine = "";
        for (int i = line.length() - 1; i >= 0; i--)
            sumReversLine += line.charAt(i); // витягуємо кожен символ рядка, починаючи з кінця
        return sumReversLine;
    }

    // 5. Метод обчислення числа в степені
    public static int exponentiationNumber (int number, int power) {
        return (int) Math.pow(number, power);
    }

    // 6. Метод для виводу текстового рядку quantity разів
    public static void writeLines (String text, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(text);
        }
    }
}