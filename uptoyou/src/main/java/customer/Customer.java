package customer;

import java.util.ArrayList;
import java.util.List;


public class Customer {

        private String firstName;

        private String lastName;

        private Integer phoneNumber;


        private List<FruitShopInMall> preferredStore = new ArrayList<>();


    public Customer(String firstName, String lastName, Integer phoneNumber) {
            super();
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;

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

        public Integer getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber() {
            this.phoneNumber = phoneNumber;
        }


        public List<FruitShopInMall> getPreferredRooms() {
            return preferredStore;
        }

        public void setPreferredRooms(List<FruitShopInMall> preferredRooms) {
            this.preferredStore = preferredRooms;
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
            Customer other = (Customer) obj;
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
            return String.format("%s %s %s", this.firstName, this.lastName, this.phoneNumber);
        }
}
