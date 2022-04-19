package buyers;

import interfaces.ISleepingPartners;

public class SleppingPartners implements ISleepingPartners {

    //Fields
    private String name;
    private Integer age;
    private String farmingCompanyName;
    private String farmingFruitName;
    private Integer howLongInThisRole;

    //Constructors

    public SleppingPartners(String name, Integer age, String farmingCompanyName,
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
        return 0;
    }

    public boolean interestedInFarmingIndustry(){
        return true;
    }

   //ToString


    @Override
    public String toString() {
        return "SleppingPartners{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", farmingCompanyName='" + farmingCompanyName + '\'' +
                ", farmingFruitName='" + farmingFruitName + '\'' +
                ", howLongInThisRole=" + howLongInThisRole +
                '}';
    }

    @Override
    public void attendMeetings() {
        System.out.println("Attend Meetings Semi-Regularly\n");
        System.out.println("Request Meeting's Agenda to learn requirements ahead\n");
        System.out.println("Approves and accepts agreed meeting point, if not proposes alternative solutions\n ");

    }

    @Override
    public void getCompanyBenefits() {
        System.out.println("Yes, they get more benefits than regular employee..lol");


    }

    @Override
    public void promoteCompany() {
        System.out.println("Yes, everytime they meet someone in networking meetings..they promote the company");

    }
}
