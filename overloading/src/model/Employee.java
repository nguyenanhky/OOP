package model;

public abstract class Employee {
    protected String name;
    protected long salary;



    public Employee(String name) {
        this.name = name;
    }

    public abstract String employeeType();
    public abstract void payroll();

    public void showInformation(){
        System.out.println("===== Nhân viên: " + name + " =====");
        System.out.println("- Loại nhân viên: " + employeeType());
        System.out.println("- Lương: " + salary + " VND");
    }
}
