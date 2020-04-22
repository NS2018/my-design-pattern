package chain;

public class LeaveInfo implements ILevel{

    private String name;

    private double days;

    private String remark;

    public LeaveInfo(String name, double days, String remark) {
        this.name = name;
        this.days = days;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "LeaveInfo{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
