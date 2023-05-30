package model;

import utils.Config;

public class EmployeeFullTime extends Employee {
    private int overtime;
    private int level;

    public EmployeeFullTime(String name) {
        super(name);
        level = Config.EMPLOYEE_REGULAR;
    }

    public EmployeeFullTime(String name,int overtime) {
        super(name);
        this.overtime = overtime;
        level = Config.EMPLOYEE_REGULAR;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String employeeType() {
        if(level==Config.EMPLOYEE_REGULAR){
            return "employee full time"+(overtime>0?"have overtime days":"no overtime days");
        }else{
            return "boss full time "+(overtime>0?"have overtime days":"no overtime days");
        }
    }
    public void calculateSalary(){
        if(level==Config.EMPLOYEE_REGULAR){
            salary = Config.SALARY_EMPLOYEE_REGULAR_FULL_TIME+overtime*800000;
        }else{
            salary = Config.SALARY_EMPLOYEE_BOSS_FULL_TIME+overtime*800000;
        }
    }

}
