
package com.myjaba.lab_3;

/**
 * @author Краб
 * Програма створена для ЛР_4 - досліджено роботу класів мовою Java, створено простуньку програму
 */
public class Lab_3{
    public static void main(String[] args) {

        Flower myFlower = new Flower();
        System.out.println(" name = "+ myFlower.getName());

        myFlower = new Flower("bober",ColourOfLeaf.red, Bud.normal);
        System.out.println(" name = "+ myFlower.getName() + " colour = "+ myFlower.getColour() +  " BudStatus = "+ myFlower.getBud());

        myFlower.BloomMyBud();
        System.out.println(" name = "+ myFlower.getName() + " colour = "+ myFlower.getColour() +  " BudStatus = "+ myFlower.getBud());

        myFlower.WiltMyBud();
        System.out.println(" name = "+ myFlower.getName() + " colour = "+ myFlower.getColour() +  " BudStatus = "+ myFlower.getBud());

    }
}
