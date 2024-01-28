package org.example;

import java.util.Scanner;

/**
 * Program with 2 different functions
 *
 * @author FellGast
 *
 * This method realise calculator
 * @see #calculator()
 *
 * This method realise counting longest world is array
 * @see #array()
 */


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите функционал программы: (1 - калькулятор, 2 - поиск самого длинного слова");
        int functional = in.next().charAt(0);
        switch (functional) {

            // калькулятор
            case '1':

                calculator();
                break;

            // массив
            case '2':
                array();
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }
        in.close();
    }

    public static void calculator() {

        double num1;
        double num2;
        double result;
        char operation;

        final Scanner input = new Scanner(System.in);

        System.out.println("Ввести первое число");
        num1 = input.nextDouble();

        System.out.println("Ввести второе число");
        num2 = input.nextDouble();

        System.out.println("Выбор оператора: +, -, *, или /");
        operation = input.next().charAt(0);

        switch (operation) {

            // сложение
            case '+':
                result = num1 + num2;
                System.out.printf("Ответ: " + "%.4f", result);
                break;

            // вычитание
            case '-':
                result = (num1 - num2);
                System.out.printf("Ответ: " + "%.4f", result);
                break;

            // умножение
            case '*':
                result = num1 * num2;
                System.out.printf("Ответ: " + "%.4f", result);
                break;

            // деление
            case '/':
                result = num1 / num2;
                System.out.printf("Ответ: " + "%.4f", result);
                break;

            default:
                System.out.println("Нет такого оператора!");
                break;

        }
        input.close();
    }

    public static void array() {
        Scanner ar = new Scanner(System.in);
        System.out.println("Выберите количество слов в массиве");
        int length = ar.nextInt();

        String[] wordsArray = new String[length];
        System.out.println("Введите слова в массив");
        for (int i = 0; i < length; i++) {
            wordsArray[i] = ar.next();
        }
        String longestWord = findLongestWord(wordsArray);

        System.out.println("Самое длинное слово: " + longestWord);

        ar.close();
    }
    public static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}