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
class Task7 {
    public void run(){
        System.out.println("----- Задача 7 ------");
        System.out.println("");
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        // посчитайте сколько раз в строке встречается введенная вами буква
        System.out.println("Введите букву: ");
        String letter = scanner.nextLine();
        int n = 0;
        n = string.length() - string.replaceAll(letter, "").length();
        
        System.out.println("Буква \""+letter+"\" встречается в тексте "+ n +" раз(а)");
        System.out.println("");
        System.out.println("----- конец задачи 7 ------");
        System.out.println("");
    }
}
