package model;

import utils.Config;

public class EmployeePartTime extends Employee {
    private int workingHours;

    public EmployeePartTime(String name,int workingHours) {
        super(name);
        this.workingHours = workingHours;
    }

    public void calculateSalary(){
        salary = Config.OVERTIME*workingHours;
    }
}
