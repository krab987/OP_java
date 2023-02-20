package com.myjaba.lab_4;

public class KitchenAppliances extends HouseholdAppliances{

    KindsKitchenApp kind;

    public KitchenAppliances(){
        super();
    }
    public KitchenAppliances(String name, String model, String firm, int power, int price){
        super(name, model, firm, power, price);
        this.status = Status.selling;
        this.kind = KindsKitchenApp.byHand;
    }

    public KindsKitchenApp getKind(){
        return kind;
    }
    public void setCondition(KindsKitchenApp kind){
        this.kind = kind;
    }
    /*
    *This method to change kind to auto
     */
    public void ChangeToAutoKind(){
        kind = KindsKitchenApp.auto;
    }

    public String GetInfo(){
        return ("Name = "+getName()+"\n Model = "+getModel()+"\nFirm = "+getFirm()+"\nPower = "+getPower()+
                "\nPrice = "+getPrice()+"\nStatus = "+getStatus()+"\nCondition = "+getCondition()+"\nKind = "+getKind());
    }

}
