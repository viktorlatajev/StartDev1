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
class Task6 {
    public void run(){
        System.out.println("----- Задача 6 ------");
        System.out.println("");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[][] = new int[10][];
        Random random = new Random();
        
        for(int x = 0; x < myArr.length;x++){
            myArr[x] = new int[(random.nextInt(9-5+1)+5)];
        }
        
        for(int i = 0; i < myArr.length;i++){
            for (int j = 0; j < myArr[i].length; j++) {
                myArr[i][j] = random.nextInt(20-0+1)-0;
                System.out.print(myArr[i][j] + "\t");
            }
            System.out.println("");
        
        }
        System.out.println("");
        System.out.println("----- конец задачи 6 ------");
        System.out.println("");
    }
}
