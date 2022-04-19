package farmers;

public class NonMinWagePayingFarmers extends Farmers{
    private String farmSize;
    private float minWage;
    private boolean committedToMinWage;
    private boolean legalEmployement;
    private boolean paysBenefits;

    public NonMinWagePayingFarmers(String name, String gender, String farmingFruitName, String villageName, String farmSize,
                                   float minWage, boolean committedToMinWage, boolean legalEmployement, boolean paysBenefits) {
        super(name, gender, farmingFruitName, villageName);
        this.farmSize = farmSize;
        this.minWage = minWage;
        this.committedToMinWage = committedToMinWage;
        this.legalEmployement = legalEmployement;
        this.paysBenefits = paysBenefits;
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

    public boolean isLegalEmployement() {
        return legalEmployement;
    }

    public void setLegalEmployement(boolean legalEmployement) {
        this.legalEmployement = legalEmployement;
    }

    public boolean isPaysBenefits() {
        return paysBenefits;
    }

    public void setPaysBenefits(boolean paysBenefits) {
        this.paysBenefits = paysBenefits;
    }
//Methods

//toString
    @Override
    public String toString() {
        return "NonMinWagePayingFarmers{" +
                "farmSize='" + farmSize + '\'' +
                ", minWage=" + minWage +
                ", committedToMinWage=" + committedToMinWage +
                ", legalEmployement=" + legalEmployement +
                ", paysBenefits=" + paysBenefits +
                '}';
    }
}
