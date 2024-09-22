package com.Innerclass;

public class InnerclassExc {
    public static void main(String[] args) {
        CellPhone cell = new CellPhone();
        CellPhone cell1 = new CellPhone();
        cell.alarmClock(new Bell(){
            public void ring(){
                System.out.println("1111") ;
            }
        });
        cell1.alarmClock(new Bell(){
            public void ring(){
                System.out.println("222") ;
            }
        });
    }
}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}
