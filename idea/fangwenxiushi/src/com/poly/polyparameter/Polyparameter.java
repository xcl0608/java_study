package com.poly.polyparameter;

public class Polyparameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",2500);
        Manager milan = new Manager("milan",5000,20000);
        Polyparameter p = new Polyparameter();
        p.showEmAnnual(tom);
        p.showEmAnnual(milan);
        p.testWork(tom);
        p.testWork(milan);
    }

    public void showEmAnnual(Employee e){
        System.out.println(e.getAnnual());
        System.out.println("a".equals("b"));
    }

    public void testWork(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof  Manager) {
            ((Manager) e).manage();

        }
    }
}
