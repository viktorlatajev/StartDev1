/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev1;

import java.util.Random;

/**
 *
 * @author user
 */
class Task5 {
    public void run(){
        System.out.println("----- Задача 5 ------");
        System.out.println("");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[][] = new int[10][5];
        Random random = new Random();
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                myArr[i][j] = random.nextInt(10);
                System.out.print(myArr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("----- конец задачи 5 ------");
        System.out.println("");
    }
}
