/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
//метод гарцати та спати
public class Tooth {
    
    public int Voic(int energy)//реалізація дії рику
    {
        energy-=10;
        System.out.println("Rrrrrrrrrrrrrrrrrrrrrraaaauuuuu!");
        return energy;
    }
    public int Sleep(int energy)//реалізація дії спати
    {
        energy+=25;
        if (energy>100)energy=100; 
        System.out.println("Zzzzzzzzzzz");
        return energy;
    }
}
