package damagedfruit;

public class DamagedFruits {

        private String name;

        private String type;

        private int capacity;

        private double rate;

        private boolean goodFruitFarm;

        public DamagedFruits(String name, String type, int capacity, double rate) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
            this.rate = rate;
        }

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

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public boolean isGoodFruitFarm() {
            return goodFruitFarm;
        }

        public void setPetFriendly(boolean goodFruitFarm) {
            this.goodFruitFarm = goodFruitFarm;
        }

    @Override
    public String toString() {
        return "DamagedFruits{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", rate=" + rate +
                ", goodFruitFarm=" + goodFruitFarm +
                '}';
    }
}

