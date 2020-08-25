import java.util.Scanner;

public class Task_5 {
    public void Task_5_myFancyMethod() {
        Scanner name_scaner = new Scanner(System.in);
        System.out.println("Введите число, которое будем умножать от 1-го до 10-ти");
        String number = name_scaner.nextLine();
        int i = Integer.parseInt(number);

        System.out.println(i + " умнажая на 1 будет : " + i * 1);
        System.out.println(i + " умнажая на 2 будет : " + i * 2);
        System.out.println(i + " умнажая на 3 будет : " + i * 3);
        System.out.println(i + " умнажая на 4 будет : " + i * 4);
        System.out.println(i + " умнажая на 5 будет : " + i * 5);
        System.out.println(i + " умнажая на 6 будет : " + i * 6);
        System.out.println(i + " умнажая на 7 будет : " + i * 7);
        System.out.println(i + " умнажая на 8 будет : " + i * 8);
        System.out.println(i + " умнажая на 9 будет : " + i * 9);
        System.out.println(i + " умнажая на 10 будет : " + i * 10);

    }
}

