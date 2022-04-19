package buyers;

import interfaces.ISleepingPartners;

public class BusinessManagingPartner {
    private String name;
    private Integer age;
    private String farmingCompanyName;
    private String farmingFruitName;
    private Integer howLongInThisRole;

    //Constructors


    public BusinessManagingPartner(String name, Integer age, String farmingCompanyName,
                                   String farmingFruitName, Integer howLongInThisRole) {
        this.name = name;
        this.age = age;
        this.farmingCompanyName = farmingCompanyName;
        this.farmingFruitName = farmingFruitName;
        this.howLongInThisRole = howLongInThisRole;
    }

    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFarmingCompanyName() {
        return farmingCompanyName;
    }

    public void setFarmingCompanyName(String farmingCompanyName) {
        this.farmingCompanyName = farmingCompanyName;
    }

    public String getFarmingFruitName() {
        return farmingFruitName;
    }

    public void setFarmingFruitName(String farmingFruitName) {
        this.farmingFruitName = farmingFruitName;
    }

    public Integer getHowLongInThisRole() {
        return howLongInThisRole;
    }

    public void setHowLongInThisRole(Integer howLongInThisRole) {
        this.howLongInThisRole = howLongInThisRole;
    }

    //Methods
    public Integer minExperiencedYears(){
        return 12;
    }

    public boolean interestedInLeadershipRoles(){
        return true;
    }

    //ToString

    @Override
    public String toString() {
        return "BusinessManagingPartner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", farmingCompanyName='" + farmingCompanyName + '\'' +
                ", farmingFruitName='" + farmingFruitName + '\'' +
                ", howLongInThisRole=" + howLongInThisRole +
                '}';
    }
}
