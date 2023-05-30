package main;

import model.EmployeeFullTime;
import model.EmployeePartTime;

public class MainClass {
    public static void main(String[] args) {
        EmployeeFullTime boss = new EmployeeFullTime("nguyen anh ky",3);
        boss.setLevel(0);
        boss.payroll();
        boss.showInformation();

        EmployeeFullTime staff = new EmployeeFullTime("Nguyen Van Quang");
        staff.payroll();
        staff.showInformation();

        EmployeePartTime staffPartTime = new EmployeePartTime("Tran Ngoc Anh",100);
        staffPartTime.payroll();
        staff.showInformation();
    }
}
