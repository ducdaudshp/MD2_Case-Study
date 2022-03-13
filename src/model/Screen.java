package model;

import java.time.LocalDate;

public class Screen extends TechnologyEquipment implements Discount{
    private int size;
    private int resolution;

    public Screen() {
    }

    public Screen(int size, int resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public Screen(String id, String name, String color, String brand, LocalDate importDate, int amount, double cost, int size, int resolution) {
        super(id, name, color, brand, importDate, amount, cost);
        this.size = size;
        this.resolution = resolution;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Screen{" + super.toString()+
                "size=" + size +
                ", resolution=" + resolution +
                '}';
    }

    @Override
    public double getRealMoney() {
        double realMoney;
        LocalDate discountDay = getDiscount();
        LocalDate discountMonth_15 = getDiscount().minusYears(4);
        LocalDate discountMonth_30 = getDiscount().minusYears(2);
        LocalDate today = LocalDate.now();
        if (today.isBefore(discountDay)){
            if (today.isAfter(discountMonth_15)){
                if (today.isAfter(discountMonth_30)){
                    realMoney = getCost() - (getCost() * 30)/100;
                    return realMoney;
                }else {
                    realMoney = getCost() - (getCost() * 15)/100;
                    return realMoney;
                }
            }else{
                realMoney = getCost() - (getCost() *10)/100;
                return  realMoney;
            }
        } else{
            realMoney = getCost() - (getCost() * 55)/100;
            return realMoney;
        }
    }

    @Override
    public LocalDate getDiscount() {
        LocalDate discount = getImportDate().plusYears(5);
        return discount;
    }
}
