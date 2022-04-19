package fruit;

public class Fruit {

    //Fields
    private String name;
    private String type;

    //Constructors


    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //methods
    public Integer noOfTypes(){
        return 64;
    }

    public boolean isTasty(){
        return true;
    }

    //ToString

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
