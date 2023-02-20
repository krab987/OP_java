/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

public class Predator {
    private int food;
    private int energy;
    private int position;
    
    public Predator()//ініціалізація 
    {
        food=100;
        energy=100;
        position=0;
    }

    public void Do(int mode)//виконання обраної дії
    {
      Tooth t= new Tooth();
       Claws c=new Claws();
        if(mode==1)energy=t.Voic(energy);
        if(mode==2)energy=t.Sleep(energy);
        if(mode==3)food=c.MakeFood(food);
        if(mode==4)position=c.Run(position);
        if(mode>4||mode<1){//штраф за невірно обрану дію
           System.out.println("Selected incorrectet action ,PENALTY");
           Penalty();
        }
        Penalty();
   
    }
    public void Penalty(){//реалізація штрафу
        food-=15;
        energy-=15;
    }
    public void ToString(){//вивід показників на екран
        System.out.println("Energy=="+energy);
        System.out.println("Food=="+food);
        System.out.println("Position=="+position);
    }
    public boolean Live()//перевірка чи живий герой
    {
        return !(food<=0||energy<=0);
    }
    public boolean Goal()//перевірка чи досяг герой цілі
    {
        return (position>=600);
    }
    
}
