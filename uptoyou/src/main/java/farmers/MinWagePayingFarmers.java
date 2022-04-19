package farmers;

public class MinWagePayingFarmers extends Farmers {

    private String farmSize;
    private float minWage;
    private boolean committedToMinWage;

    public MinWagePayingFarmers(String name, String gender, String farmingFruitName, String villageName,
                                String farmSize, float minWage, boolean committedToMinWage) {
        super(name, gender, farmingFruitName, villageName);
        this.farmSize = farmSize;
        this.minWage = minWage;
        this.committedToMinWage = committedToMinWage;
    }

    public String getFarmSize() {
        return farmSize;
    }

    public void setFarmSize(String farmSize) {
        this.farmSize = farmSize;
    }

    public float getMinWage() {
        return minWage;
    }

    public void setMinWage(float minWage) {
        this.minWage = minWage;
    }

    public boolean isCommittedToMinWage() {
        return committedToMinWage;
    }

    public void setCommittedToMinWage(boolean committedToMinWage) {
        this.committedToMinWage = committedToMinWage;
    }

    @Override
    public String toString() {
        return "MinWagePayingFarmers{" +
                "farmSize='" + farmSize + '\'' +
                ", minWage=" + minWage +
                ", committedToMinWage=" + committedToMinWage +
                '}';
    }
}
