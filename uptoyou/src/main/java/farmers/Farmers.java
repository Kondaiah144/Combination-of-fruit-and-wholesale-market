package farmers;

public class Farmers {

    private String name;
    private String gender;
    private String farmingFruitName;
    private String villageName;

    public Farmers(String name, String gender, String farmingFruitName, String villageName) {
        this.name = name;
        this.gender = gender;
        this.farmingFruitName = farmingFruitName;
        this.villageName = villageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFarmingFruitName() {
        return farmingFruitName;
    }

    public void setFarmingFruitName(String farmingFruitName) {
        this.farmingFruitName = farmingFruitName;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    //Methods
    public boolean farmersAreMoreThanOneGender(){
        return true;
    }

    //ToString

    @Override
    public String toString() {
        return "Farmers{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", farmingFruitName='" + farmingFruitName + '\'' +
                ", villageName='" + villageName + '\'' +
                '}';
    }
}
