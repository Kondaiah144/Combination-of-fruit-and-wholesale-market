package fruit;

public class FruitShape extends Fruit {

    //Fields
    private String appleShape;
    private String mangoShape;
    private String orangeShape;

    //Constructor
    public FruitShape(String name, String type, String appleShape, String mangoShape, String orangeShape) {
        super(name, type);
        this.appleShape = appleShape;
        this.mangoShape = mangoShape;
        this.orangeShape = orangeShape;
    }

    //Getters and Setters

    public String getAppleShape() {
        return appleShape;
    }

    public void setAppleShape(String appleShape) {
        this.appleShape = appleShape;
    }

    public String getMangoShape() {
        return mangoShape;
    }

    public void setMangoShape(String mangoShape) {
        this.mangoShape = mangoShape;
    }

    public String getOrangeShape() {
        return orangeShape;
    }

    public void setOrangeShape(String orangeShape) {
        this.orangeShape = orangeShape;
    }

    //Methods
    public String shapeSizes(){
        return "Small, + Medium, + Large";
    }

    public boolean shapeDiffersByFruit(){
        return true;
    }


    //ToString

    @Override
    public String toString() {
        return "FruitShape{" +
                "appleShape='" + appleShape + '\'' +
                ", mangoShape='" + mangoShape + '\'' +
                ", orangeShape='" + orangeShape + '\'' +
                '}';
    }

}
