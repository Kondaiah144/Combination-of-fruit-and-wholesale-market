package fruit;

public class Mango extends Fruit{

    //Fields
    private String region;
    private boolean isSeasonal;

    //Constructors

    public Mango(String name, String type, String region, boolean isSeasonal) {
        super(name, type);
        this.region = region;
        this.isSeasonal = isSeasonal;
    }

    //Getters and Setters

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isSeasonal() {
        return isSeasonal;
    }

    public void setSeasonal(boolean seasonal) {
        isSeasonal = seasonal;
    }

    //Methods

    public String myMangoGarden(){
        return "Sevya and Sons";
    }

    public boolean didYouGetFreeMangos(){
        return true;
    }

  //ToString


    @Override
    public String toString() {
        return "Mango{" +
                "region='" + region + '\'' +
                ", isSeasonal=" + isSeasonal +
                '}';
    }
}
