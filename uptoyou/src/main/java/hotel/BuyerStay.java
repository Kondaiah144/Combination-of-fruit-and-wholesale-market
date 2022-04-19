package hotel;

import java.util.ArrayList;
import java.util.List;

public class BuyerStay {

    private String firstName;

    private String lastName;

    private boolean loyaltyProgramMember;

    private List<HotelRoom> preferredRooms = new ArrayList<>();

    public BuyerStay(String firstName, String lastName, boolean loyaltyProgramMember) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.loyaltyProgramMember = loyaltyProgramMember;
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

    public boolean isLoyaltyProgramMember() {
        return loyaltyProgramMember;
    }

    public void setLoyaltyProgramMember(boolean loyaltyProgramMember) {
        this.loyaltyProgramMember = loyaltyProgramMember;
    }

    public List<HotelRoom> getPreferredRooms() {
        return preferredRooms;
    }

    public void setPreferredRooms(List<HotelRoom> preferredRooms) {
        this.preferredRooms = preferredRooms;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BuyerStay other = (BuyerStay) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

}