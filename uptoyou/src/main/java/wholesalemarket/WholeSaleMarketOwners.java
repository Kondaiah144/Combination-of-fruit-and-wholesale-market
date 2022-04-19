package wholesalemarket;
import wholesalemarket.WholeSaleMarket;

public class WholeSaleMarketOwners extends WholeSaleMarket{

    private String firstName;
    private String lastName;
    private String city;
    private int shareValue;

    public WholeSaleMarketOwners(String marketName, String location,
                                 boolean registrationLimitedNumber, String firstName, String lastName, String city, int shareValue) {
        super(marketName, location, registrationLimitedNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.shareValue = shareValue;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getShareValue() {
        return shareValue;
    }

    public void setShareValue(int shareValue) {
        this.shareValue = shareValue;
    }

    @Override
    public String toString() {
        return "WholeSaleMarketOwners{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", shareValue=" + shareValue +
                '}';
    }
}
