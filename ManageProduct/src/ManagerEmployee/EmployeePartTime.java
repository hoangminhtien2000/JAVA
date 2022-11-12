package ManagerEmployee;

public class EmployeePartTime extends Employee{
    private int soBuoi;
    public EmployeePartTime() {
    }

    public EmployeePartTime(String name, int age, String gerder, int soBuoi) {
        super(name, age, gerder);
        this.soBuoi=soBuoi;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    @Override
    public double salary() {
        return getSoBuoi()*200000;
    }

    @Override
    public String toString() {
        return "EmployeePartTime{" +
                "Tên='" + getName()+ '\'' +
                ", Tuổi=" + getAge() +
                ", Giới tính='" + getGerder() + '\'' +
                ", Số buổi=" + getSoBuoi() +
                "}";

    }
}
