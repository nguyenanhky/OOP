package model;

import utils.Config;

public class EmployeePartTime extends Employee {
    private int workingHours;

    public EmployeePartTime(String name,int workingHours) {
        super(name);
        this.workingHours = workingHours;
    }

    @Override
    public String employeeType() {
        return "staff part time ";
    }

    @Override
    public void payroll() {
        salary = Config.SALARY_STAFF_WORKING_ONE_HOURS*workingHours;
    }

}
