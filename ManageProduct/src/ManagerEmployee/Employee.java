package ManagerEmployee;

public abstract class Employee {
    private String name;
    private int age;
    private String gerder;

    public Employee() {
    }

    public Employee(String name, int age, String gerder) {
        this.name = name;
        this.age = age;
        this.gerder = gerder;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGerder() {
        return gerder;
    }

    public void setGerder(String gerder) {
        this.gerder = gerder;
    }

    public abstract double salary();


    public String covertSalary(double salary) {
        String covertSalary = String.format("%,.0f vnd", salary);
        return covertSalary;
    }

    public String toString() {
        return "Employee{" +
                "Tên='" + getName() + '\'' +
                ", Tuổi=" + getAge() +
                ", Giới tính='" + getGerder() + '\'' +
                "}";
    }
}
