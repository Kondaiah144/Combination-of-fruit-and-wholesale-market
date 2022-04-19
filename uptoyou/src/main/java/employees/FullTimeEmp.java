package employees;

public class FullTimeEmp extends Employee {
    private boolean fullTime;
    private boolean legallyAllowedToWork;

    public FullTimeEmp(String firstName, String lastName, String farmName,
                       boolean fullTime, boolean legallyAllowedToWork) {
        super(firstName, lastName, farmName);
        this.fullTime = fullTime;
        this.legallyAllowedToWork = legallyAllowedToWork;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public boolean isLegallyAllowedToWork() {
        return legallyAllowedToWork;
    }

    public void setLegallyAllowedToWork(boolean legallyAllowedToWork) {
        this.legallyAllowedToWork = legallyAllowedToWork;
    }

    @Override
    public String toString() {
        return "FullTimeEmp{" +
                "fullTime=" + fullTime +
                ", legallyAllowedToWork=" + legallyAllowedToWork +
                '}';
    }
}
