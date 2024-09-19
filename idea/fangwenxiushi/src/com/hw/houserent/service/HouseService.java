package com.hw.houserent.service;
import com.hw.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"x","118","shanghai",2000,"未出");
    }

    public boolean add(House newHouse){
        if(houseNums == houses.length){
            System.out.println("数组已满无法添加");
            return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public House[] list(){
        return houses;
    }
}
