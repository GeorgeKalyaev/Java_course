import java.io.*;
import java.util.Scanner;

public class Task_17 {
    public void Task_17_myFancyMethod() {
        File log = new File("C:\\qwerty.txt");

        try{
          //  while (X != 1997){

            while (true){
                Scanner name_scaner = new Scanner(System.in);
                System.out.println("Введите число");
                int X = name_scaner.nextInt();

                if (X != 1997){
                    PrintWriter out = new PrintWriter(new FileWriter(log, true));
                    out.append(" efwefewf wefewf" + "\n");
                   out.close();
                }else {
                    PrintWriter out = new PrintWriter(new FileWriter(log, true));
                   // out.append(X + "\n");
                    out.close();
                }
            }


           /* do {
                Scanner name_scaner = new Scanner(System.in);
                System.out.println("Введите число");
                int X = name_scaner.nextInt();

                if (X == 1997){
                    PrintWriter out = new PrintWriter(new FileWriter(log, true));
                   // out.append(X + "\n");
                    out.close();
                }
            }while (){

            }*/


        }catch(IOException e){
            System.out.println("COULD NOT LOG!!");
        }
    }
}