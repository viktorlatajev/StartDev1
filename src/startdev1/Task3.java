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
class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int rnum = 0;
        int min = 100;
        int max = 0;
        int sum = 0;
        int myArr[] = new int[10];
        for(int i = 0; i < myArr.length;i++){
            while (true){
                rnum = random.nextInt(99-0+1)+0;
                if(rnum % 1 == 0){
                    myArr[i] = rnum;
                    break;
                }
            }
            if(myArr[i] > max) max = myArr[i];
            if(myArr[i] < min) min = myArr[i];
            sum += myArr[i];
            
            System.out.printf("%4d",myArr[i]);
        }
        System.out.println("\nСумма всех чисел массива: " + sum);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("");
        System.out.println("----- конец задачи 3 ------");
        System.out.println("");
    }
}
