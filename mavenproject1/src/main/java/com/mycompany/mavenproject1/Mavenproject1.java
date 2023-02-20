/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Mavenproject1 {
//робота з інтерфейсом
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in); //використання класу сканер
        System.out.println("Pacyuk is ready, your goal-run 600 meters");
        Predator pac=new Predator();//додавання елементу класу Хижак
        int moves=0;//ініціалізація
        int mode;
        pac.ToString();//вивід початкових показників
        while(pac.Live()&&(!pac.Goal())){//перевірка для завершення роботи
        System.out.println("Next 1-Voic 2-Sleep 3-Make Food 4-Run other-penalty)");
        mode=scanner.nextInt();//вибір наступної дії
        pac.Do(mode);//виконання обраної дії
        pac.ToString();//вивід показників
        moves++;
       
        }
        //результати
        if(pac.Goal())System.out.println("Victory , moves-"+moves);
        else System.out.println("Game over(");
    }
}
