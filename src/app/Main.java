package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Створюємо сканер
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Введіть ціле число: ");
        int number = scanner.nextInt(); //<-зчитуємо значення цілого числа для обчислення квадрата

        System.out.println("Квадрат числа " + number + " дорівнює " + calculateSquare(number));

        System.out.print("\n2. Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();

        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height +
                " дорівнює " + calculateVolCylinder(radius, height));

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

//    // 3. Метод обчислення суми значень в масиві
//    public static int[] sumArray () {
//        //TODO сума значень в масиві
//    }
//
//    // 4.
//    public static String reverseLine (String line) {
//
//    }

    // 5. Метод обчислення числа в степені
    public static int exponentiationNumber (int number, int power) {
        return (int) Math.pow(number, power);
    }

    // 6.
    public static void writeLines (String text, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(text);
        }
    }
}