
package com.myjaba.lab_4;

/**
 *
 * @author Краб
 *This is class that save HouseholdAppliance info
 */
public class HouseholdAppliances {
    String name;
    String model;
    String firm;
    int power;
    int price;
    Status status;
    Condition condition = Condition.works;

    public HouseholdAppliances(){
        this.status = Status.selling;
    }
    public HouseholdAppliances(String name, String model, String firm, int power, int price){
        this.name = name;
        this.model = model;
        this.firm = firm;
        this.power = power;
        this.price = price;
        this.status = Status.selling;
        this.condition = condition;
    }
/*
* This fields will change condition to doesnt works
 */
    public void ConditionChange(){
        condition = Condition.doNotWorks;
    }
    /*
    * Method to change status
     */
    public void ChangeStatus(int ind){
        if(ind == Status.selling.ordinal())
            status = Status.selling;
        if(ind == Status.sold.ordinal())
            status = Status.sold;
        if(ind == Status.awaiting.ordinal())
            status = Status.awaiting;
    }
    /*
     * Method to to get inf
     * @return res is inf
     */
    public String GetInfo(){
        String res = ("Name = "+getName()+"\n Model = "+getModel()+"\nFirm = "+getFirm()+"\nPower = "+getPower()+
                "\nPrice = "+getPrice()+"\nStatus = "+getStatus()+"\nCondition = "+getCondition());
        return res;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getFirm(){
        return firm;
    }
    public void setFirm(String firm){
        this.firm = firm;
    }
    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power = power;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public Condition getCondition(){
        return condition;
    }
    public void setCondition(Condition condition){
        this.condition = condition;
    }
    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }

}
