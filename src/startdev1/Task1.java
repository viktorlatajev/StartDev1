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
class Task1 {
    public void run(){
        int a;
        int d = 32;
        double c;
        double b = 1.8;
        System.out.println("----- Задача 1 ------");
        System.out.println("");
        System.out.println("Введите число градусов по Цельсию: ");
        // решение задачи
        a = new Scanner(System.in).nextInt();
        c = a * b + d;
        System.out.println("По Фарингейту это будет: ");
        System.out.println(c);
        System.out.println("");
        System.out.println("----- конец задачи 1 ------");
        System.out.println("");
    }
}
