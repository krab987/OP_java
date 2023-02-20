package com.myjaba.lab_4;

/**
 * @author Краб
 * Побутові електроприлади (теле-, аудіо-, відео-, кухонні тощо).
 * Властивості: назва, тип моделі, фірма-виробник, призначення,
 * напруга живлення, споживана потужність, режими роботи, вага, ціна і т. д.
 * Поведінка: визначення та зміна властивостей, стану та режимів роботи.
 */

import java.util.Scanner;

public class Lab_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "", model = "", firm = "";
        int power = 0, price = 0;

        System.out.println("Input name");
        name = in.next();
        System.out.println("Input model");
        model = in.next();
        System.out.println("Input firm");
        firm = in.next();
        System.out.println("Input power in watt");
        power = in.nextInt();
        System.out.println("Input price");
        price = in.nextInt();

        HouseholdAppliances myTool = new HouseholdAppliances(name, model, firm, power, price);
        System.out.println(myTool.GetInfo());

        ChoozeStatus(in, myTool);
        System.out.println("Input 1 to Change Condition to doesnt works");
        int indCond= in.nextInt();
        if(indCond == 1)
            myTool.ConditionChange();
        System.out.println(myTool.GetInfo());

        System.out.println("Input name");
        name = in.next();
        System.out.println("Input model");
        model = in.next();
        System.out.println("Input firm");
        firm = in.next();
        System.out.println("Input power in watt");
        power = in.nextInt();
        System.out.println("Input price");
        price = in.nextInt();

        KitchenAppliances kitchenTool = new KitchenAppliances(name, model, firm, power, price);
        System.out.println(kitchenTool.GetInfo());

        ChoozeStatus(in, kitchenTool);
        System.out.println("Input 1 to Change To Auto Kind");
        int indAuto = in.nextInt();
        if(indAuto == 1)
            kitchenTool.ChangeToAutoKind();
        System.out.println("Input 1 to Change Condition to doesnt works");
        indCond= in.nextInt();
        if(indCond == 1)
            kitchenTool.ConditionChange();
        System.out.println(kitchenTool.GetInfo());

        in.close();
    }

    private static void ChoozeStatus(Scanner in, HouseholdAppliances myTool) {
        System.out.println("Choose status");
        Status[] statuses = Status.values();
        for (int i = 0; i < statuses.length; i++) {
            System.out.println(i + " = " + statuses[i]);
        }
        int indStatus = in.nextInt();
        myTool.ChangeStatus(indStatus);

    }
    private static void ChoozeStatus(Scanner in, KitchenAppliances myTool) {
        System.out.println("Choose status");
        Status[] statuses = Status.values();
        for (int i = 0; i < statuses.length; i++) {
            System.out.println(i + " = " + statuses[i]);
        }
        int indStatus = in.nextInt();
        myTool.ChangeStatus(indStatus);

    }
}

//        System.out.println("Choose status");
//        Menu[] menus = Menu.values();
//        for (int i = 0; i < menus.length; i++) {
//            System.out.println(i + " = " + menus[i]);
//        }
//        int indMenu = in.nextInt();
//        switch (indMenu) {
//            case 0:
//                System.out.println("Input name");
//                name = in.next();
//                System.out.println("Input model");
//                model = in.next();
//                System.out.println("Input firm");
//                firm = in.next();
//                System.out.println("Input power in watt");
//                power = in.nextInt();
//                System.out.println("Input price");
//                price = in.nextInt();
//                break;
//            case 1:
//                myTool = new HouseholdAppliances(name, model, firm, power, price);
//                break;
//            case 2:
//                kitTool = new KitchenAppliances(name, model, firm, power, price);
//                break;
//            case 3:
//                System.out.println("Choose status");
//                for (int i = 0; i < statuses.length; i++) {
//                    System.out.println(i + " = " + statuses[i]);
//                }
//                int indStatus = in.nextInt();
//                myTool.ChangeStatus(indStatus);
//                System.out.println(myTool.GetInfo());
//                break;
//            case 4:
//                System.out.println("Choose status");
//                for (int i = 0; i < statuses.length; i++) {
//                    System.out.println(i + " = " + statuses[i]);
//                }
//                indStatus = in.nextInt();
//                myTool.ChangeStatus(indStatus);
//                break;
//            case 5:
//                kitTool.ChangeToAutoKind();
//                break;
//        }
//        System.out.println(myTool.GetInfo());
//
//        System.out.println(myTool.GetInfo());


//
//System.out.println("Input name");
//        String name = in.next();
//        myTool.setName(name);
//        System.out.println("Input model");
//        String model = in.next();
//        myTool.setModel(model);
//        System.out.println("Input firm");
//        String firm = in.next();
//        myTool.setFirm(firm);
//        System.out.println("Input power in watt");
//        int power = in.nextInt();
//        myTool.setPower(power);
//        System.out.println("Input price");
//        int price = in.nextInt();
//        myTool.setPrice(price);
//        System.out.println(myTool.GetInfo());
//        break;
