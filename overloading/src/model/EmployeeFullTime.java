package model;

import utils.Config;

public class EmployeeFullTime extends Employee {
    private int overtime;
    private int level;



    public EmployeeFullTime(String name,int overtime,int level) {
        super(name);
        this.overtime = overtime;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void payroll() {
        if(level==Config.STAFF){
            salary = Config.SALARY_STAFF_FULL_TIME + overtime*Config.SALARY_EMPLOYEE_ONE_DAY;
        }else{
            salary = Config.SALARY_BOSS_FULL_TIME +overtime*Config.SALARY_EMPLOYEE_ONE_DAY;
        }
    }

    @Override
    public String employeeType() {
        if(level==Config.STAFF){
            return "staff full time"+(overtime>0?" have overtime days":" no overtime days");
        }else{
            return "boss full time "+(overtime>0?" have overtime days":" no overtime days");
        }
    }


}
