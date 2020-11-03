/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
class Task2 {
    public void run(){
        int min = 5;
        int max = 10;
        Random random = new Random();
        int myNumber = random.nextInt(max-min+1)+min;
        System.out.println("----- Задача 2 ------");
        System.out.println("");
        System.out.println("Загадано число от 5 до 10: ");
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        System.out.println("Отгадай: ");
        do{
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber){
                System.out.println("Ты выиграл!");
                break;
            }else{
                if(attempt < 3){
                    System.out.println("Ты проиграл!");
                    break;
                }
            }
            attempt++;
        }while(true);
        System.out.println("");
        System.out.println("----- конец задачи 2 ------");
        System.out.println("");
    }
}
