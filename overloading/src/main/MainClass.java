package main;

import model.EmployeeFullTime;
import model.EmployeePartTime;

public class MainClass {
    public static void main(String[] args) {
        EmployeeFullTime employeeFullTime = new EmployeeFullTime("nguyen anh ky");
        employeeFullTime.setLevel(0);
        employeeFullTime.calculateSalary();

        employeeFullTime.showInformation();

        EmployeeFullTime employeeFullTime1 = new EmployeeFullTime("Tran Duc Nhan",3);
        employeeFullTime1.setLevel(0);
        employeeFullTime1.calculateSalary();

        employeeFullTime1.showInformation();


        EmployeePartTime employeePartTime = new EmployeePartTime("Dang Thi Duyen",240);
        employeePartTime.calculateSalary();
        employeePartTime.showInformation();
    }
}
