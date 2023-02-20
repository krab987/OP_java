
public class Flower {
//@param name its name
    private String name;
    private ColourOfLeaf colour;
    private Bud bud;


    Flower(){
        this("none",ColourOfLeaf.blue, Bud.normal);
    }
    Flower(String name){
        this.name = name;
        this.colour = ColourOfLeaf.green;
        this.bud = Bud.normal;
    }
    Flower(String name, ColourOfLeaf colour, Bud bud){
        this.name = name;
        this.colour = colour;
        this.bud = bud;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ColourOfLeaf getColour(){
        return colour;
    }
    public void setColour(ColourOfLeaf colour){
        this.colour = colour;
    }
    public Bud getBud(){
        return bud;
    }
    public void GetBud(Bud bud){
        this.bud = bud;
    }
    /*
    * Метод що розквітає крітку
     */
    void BloomMyBud(){
        bud = Bud.bloom;
    }
    /*
     * Метод - квітка в'яне
     */
    void WiltMyBud(){
        bud = Bud.wilt;
    }


}
