package model;

public class Employee {
    protected String name;
    protected long salary;



    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    public String employeeType(){
        return "";
    }

    public void showInformation(){
        System.out.println("===== Nhân viên: " + name + " =====");
        System.out.println("- Loại nhân viên: " + employeeType());
        System.out.println("- Lương: " + salary + " VND");
    }
}
