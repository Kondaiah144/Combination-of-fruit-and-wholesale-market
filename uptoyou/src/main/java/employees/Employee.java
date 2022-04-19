package employees;

import customer.FruitShopInMall;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String firstName;
    private String lastName;
    private String farmName;

    public Employee(String firstName, String lastName, String farmName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.farmName = farmName;
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

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", farmName='" + farmName + '\'' +
                '}';
    }
}
