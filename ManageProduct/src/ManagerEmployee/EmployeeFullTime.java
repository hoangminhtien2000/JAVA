package ManagerEmployee;

public class EmployeeFullTime extends Employee{
    private double heSo;
    public EmployeeFullTime() {
    }

    public EmployeeFullTime(String name, int age, String gerder,double heSo) {
        super(name, age, gerder);
        this.heSo=heSo;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }
    @Override
    public double salary() {
        return heSo * 5000000;
    }

    @Override
    public String toString() {
        return "EmployeeFullTime{" +
                "Tên='" + getName() + '\'' +
                ", Tuổi=" + getAge() +
                ", Giới tính='" + getGerder() + '\'' +
                ", Hệ số=" + getHeSo() +
                "}";
    }
}
