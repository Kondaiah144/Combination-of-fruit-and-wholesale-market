package employees;

public class PartTimeEmp extends Employee{
    private boolean partTime;
    private boolean legallyAllowedToWork;

    public PartTimeEmp(String firstName, String lastName, String farmName,
                       boolean partTime, boolean legallyAllowedToWork) {
        super(firstName, lastName, farmName);
        this.partTime = partTime;
        this.legallyAllowedToWork = legallyAllowedToWork;
    }

    public boolean isPartTime() {
        return partTime;
    }

    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }

    public boolean isLegallyAllowedToWork() {
        return legallyAllowedToWork;
    }

    public void setLegallyAllowedToWork(boolean legallyAllowedToWork) {
        this.legallyAllowedToWork = legallyAllowedToWork;
    }

    @Override
    public String toString() {
        return "PartTimeEmp{" +
                "partTime=" + partTime +
                ", legallyAllowedToWork=" + legallyAllowedToWork +
                '}';
    }
}
