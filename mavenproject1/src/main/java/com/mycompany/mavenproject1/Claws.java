/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
//метод добувати їжу та бігти
public class Claws  {
  
    
    public int MakeFood(int food)//реалізація добування їжі
    {
        food+=30;
        if(food>100)food=100;
        System.out.println("It was delicious");
        return food;
    }
     public int Run(int position)//реалізація бігу
    {
        position+=100;
        System.out.println("Tigidik tigidik");
        return position;
    }
}
