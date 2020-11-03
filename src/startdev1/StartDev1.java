/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class StartDev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("----- Задания -----");
        System.out.println("");
        boolean repeat = true;
        do{
            System.out.println("0. Выход из программы");
            System.out.println("1. Задание 1");
            System.out.println("2. Задание 2");
            System.out.println("3. Задание 3");
            System.out.println("4. Задание 4");
            System.out.println("5. Задание 5");
            System.out.println("6. Задание 6");
            System.out.println("7. Задание 7");
            System.out.println("");

            System.out.println("Выбери задание: ");

            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();

            switch(task){
                case 0:
                    System.out.println("----- Конец программы -----");
                    repeat = false;
                    break;
                case 1:
                    Task1 task1 = new Task1();
                    task1.run();
                    break;
                case 2:
                    Task2 task2 = new Task2();
                    task2.run();
                    break;
                case 3:
                    Task3 task3 = new Task3();
                    task3.run();
                    break;
                case 4:
                    Task4 task4 = new Task4();
                    task4.run();
                    break;
                case 5:
                    Task5 task5 = new Task5();
                    task5.run();
                    break;
                case 6:
                    Task6 task6 = new Task6();
                    task6.run();
                    break;
                case 7:
                    Task7 task7 = new Task7();
                    task7.run();
                    break;
                default:
                    System.out.println("Не выбрано задание");
                    break;
            }
        
        }while(repeat);
        
    }
    
}
