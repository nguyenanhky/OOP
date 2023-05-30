package main;


import model.Employee;
import model.EmployeeFullTime;
import model.EmployeePartTime;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input count employee : ");
        int totalStaff = Integer.parseInt(scanner.nextLine());


        Employee[]employees = new Employee[totalStaff];
        for(int i = 0 ;i<employees.length;i++){
            System.out.print("name staff  "+(i+1)+" : ");
            String nameStaff = scanner.nextLine();
            System.out.print("staff (1- staff full time, 2- staff part time) :");
            int chooseStaff = Integer.parseInt(scanner.nextLine());
            if(chooseStaff==1){
                System.out.print("level staff (1-boss, 2-staff) : ");
                int level = Integer.parseInt(scanner.nextLine());
                System.out.print("have over time (yes or no): ");
                int overtime = Integer.parseInt(scanner.nextLine());
                employees[i] = new EmployeeFullTime(nameStaff,overtime,level);
            }else{
                System.out.print("working hours: ");
                int workingHours = Integer.parseInt(scanner.nextLine());
                employees[i] = new EmployeePartTime(nameStaff,workingHours);
            }
        }
        System.out.println("\nKết quả tính lương\n");
        for(Employee employee : employees){
            employee.payroll();
            employee.showInformation();
        }
    }
}
