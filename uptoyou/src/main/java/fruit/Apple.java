package fruit;

public class Apple extends Fruit {
    private String color;
    private Integer varieties;

    public Apple(String name, String type, String color, Integer varieties) {
        super(name, type);
        this.color = color;
        this.varieties = varieties;
    }
//Getters and Setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getVarieties() {
        return varieties;
    }

    public void setVarieties(Integer varieties) {
        this.varieties = varieties;
    }

    //Methods
    public boolean didYouEat(){
        return true;
    }

    //ToString

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", varieties=" + varieties +
                '}';
    }
}
