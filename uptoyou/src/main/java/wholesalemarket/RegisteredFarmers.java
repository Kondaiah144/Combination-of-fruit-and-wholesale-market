package wholesalemarket;

public class RegisteredFarmers extends WholeSaleMarket{

    private String farmerName;
    private String farmName;
    private String city;
    private boolean feeRequiredForRegistration;

    public RegisteredFarmers(String marketName, String location, boolean registrationLimitedNumber,
                             String farmerName, String farmName, String city, boolean feeRequiredForRegistration) {
        super(marketName, location, registrationLimitedNumber);
        this.farmerName = farmerName;
        this.farmName = farmName;
        this.city = city;
        this.feeRequiredForRegistration = feeRequiredForRegistration;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isFeeRequiredForRegistration() {
        return feeRequiredForRegistration;
    }

    public void setFeeRequiredForRegistration(boolean feeRequiredForRegistration) {
        this.feeRequiredForRegistration = feeRequiredForRegistration;
    }

    @Override
    public String toString() {
        return "RegisteredFarmers{" +
                "farmerName='" + farmerName + '\'' +
                ", farmName='" + farmName + '\'' +
                ", city='" + city + '\'' +
                ", feeRequiredForRegistration=" + feeRequiredForRegistration +
                '}';
    }
}
