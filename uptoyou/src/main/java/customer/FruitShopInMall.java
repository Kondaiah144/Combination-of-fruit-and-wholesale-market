package customer;

import customer.FruitShopInMall;
import customer.Customer;

public class FruitShopInMall {

        private String name;

        private String type;

        private int inventory;

        private double value;

        private boolean allFruitsAvailable;



//Constructors
    public FruitShopInMall(String name, String type, int inventory, double value, boolean allFruitsAvailable) {
        this.name = name;
        this.type = type;
        this.inventory = inventory;
        this.value = value;
        this.allFruitsAvailable = allFruitsAvailable;
    }

//Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isAllFruitsAvailable() {
        return allFruitsAvailable;
    }

    public void setAllFruitsAvailable(boolean allFruitsAvailable) {
        this.allFruitsAvailable = allFruitsAvailable;
    }

    //ToString


    @Override
    public String toString() {
        return "FruitShopInMall{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", inventory=" + inventory +
                ", value=" + value +
                ", allFruitsAvailable=" + allFruitsAvailable +
                '}';
    }

    @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            long temp;
            temp = Double.doubleToLongBits(value);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {

            System.out.format("Comparing %s with %s%n", this.name, ((FruitShopInMall)obj).name);

            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            FruitShopInMall other = (FruitShopInMall) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
                return false;
            return true;
        }

    }

