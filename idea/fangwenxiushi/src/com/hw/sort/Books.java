package com.hw.sort;

public class Books {
    private String name;
    private int prices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public Books(String name, int prices) {
        this.name = name;
        this.prices = prices;
    }


    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", prices=" + prices +
                '}';
    }
}
