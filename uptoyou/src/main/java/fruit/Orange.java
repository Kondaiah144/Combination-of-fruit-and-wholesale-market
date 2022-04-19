package fruit;

public class Orange extends Fruit{

    //Fields
    private String size;
    private String region;
    private boolean lowPrice;

    //Constructors


    public Orange(String name, String type, String size, String region, boolean lowPrice) {
        super(name, type);
        this.size = size;
        this.region = region;
        this.lowPrice = lowPrice;
    }

    //Getters and Setters

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(boolean lowPrice) {
        this.lowPrice = lowPrice;
    }

    //Methods
    public String villageName(){
        return "Shimla";
    }

    public boolean growsInYourVillage(){
        return true;
    }

    //ToString

    @Override
    public String toString() {
        return "Orange{" +
                "size='" + size + '\'' +
                ", region='" + region + '\'' +
                ", lowPrice=" + lowPrice +
                '}';
    }
}
