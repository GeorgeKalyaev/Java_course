import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner name_scaner = new Scanner(System.in);
        System.out.println("Введите номер задачи, которую нужно воспроизвести ");
        String number_task = name_scaner.nextLine(); // номер задачи
        int i = Integer.parseInt(number_task);

        int value;
        switch (i) {
            case 3:
                //Создание и запуск простой программы
                Task_3 myClassObject_3 = new Task_3();
                myClassObject_3.Task_3_FancyMethod();
                break;
            case 4:
                // Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
                Task_4 myClassObject_4 = new Task_4();
                myClassObject_4.Task_4_myFancyMethod();
                break;
            case 5:
                //Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
                Task_5 myClassObject_5 = new Task_5();
                myClassObject_5.Task_5_myFancyMethod();
                break;
            case 6:
                /*Написать программу, которая будет выполнять следующие действия:
                1. Ввод трех чисел с клавиатуры x, y, z
                2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
                3. Деление среднего арифметического на 2 без остатка
                4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"*/
                Task_6 myClassObject_6 = new Task_6();
                myClassObject_6.Task_6_FancyMethod();
                break;
            case 7:
                //Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number. В программе должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z. Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
                Task_7 myClassObject_7 = new Task_7();
                myClassObject_7.Task_7_myFancyMethod();
                break;
            case 8:
                //Необходимо с помощью цикла вывести на экран числа от 1 до 50.
                Task_8 myClassObject_8 = new Task_8();
                myClassObject_8.Task_8_myFancyMethod();
                break;
            case 9:
                //Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2. Размер массива задается пользователем.
                Task_9 myClassObject_9 = new Task_9();
                myClassObject_9.Task_9_myFancyMethod();
                break;
            case 10:
                //Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
                Task_10 myClassObject_10 = new Task_10();
                myClassObject_10.Task_10_myFancyMethod();
                break;
            default:
                value = 0;
        }

    }

}
