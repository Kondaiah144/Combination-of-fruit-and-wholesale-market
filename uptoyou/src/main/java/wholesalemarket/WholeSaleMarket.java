package wholesalemarket;

public class WholeSaleMarket {
    private String marketName;
    private String location;
    private boolean registrationLimitedNumber;

    public WholeSaleMarket(String marketName, String location, boolean registrationLimitedNumber) {
        this.marketName = marketName;
        this.location = location;
        this.registrationLimitedNumber = registrationLimitedNumber;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isRegistrationLimitedNumber() {
        return registrationLimitedNumber;
    }

    public void setRegistrationLimitedNumber(boolean registrationLimitedNumber) {
        this.registrationLimitedNumber = registrationLimitedNumber;
    }

    @Override
    public String toString() {
        return "WholeSaleMarket{" +
                "marketName='" + marketName + '\'' +
                ", location='" + location + '\'' +
                ", registrationLimitedNumber=" + registrationLimitedNumber +
                '}';
    }
}
