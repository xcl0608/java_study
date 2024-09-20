package com.poly.polyparameter;

public class Manager extends Employee{
    public double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }
    public Manager(){}

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
    public void manage(){
        System.out.println("manager "+getName()+" is managing");
    }
}
