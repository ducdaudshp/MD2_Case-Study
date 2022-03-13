package model;

import java.time.LocalDate;

public class Mouse extends TechnologyEquipment implements Discount{
    private String connect;
    private double weight;

    public Mouse() {
    }

    public Mouse(String connect, double weight) {
        this.connect = connect;
        this.weight = weight;
    }

    public Mouse(String id, String name, String color, String brand, LocalDate importDate, int amount, double cost, String connect, double weight) {
        super(id, name, color, brand, importDate, amount, cost);
        this.connect = connect;
        this.weight = weight;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Mouse{" + super.toString()+
                "connect='" + connect + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public double getRealMoney() {
        double realMoney;
        LocalDate discountDay = getDiscount();
        LocalDate discountMonth_10 = getDiscount().minusMonths(18);
        LocalDate discountMonth_25 = getDiscount().minusMonths(12);
        LocalDate today = LocalDate.now();
        if (today.isBefore(discountDay)){
            if (today.isAfter(discountMonth_10)){
                if (today.isAfter(discountMonth_25)){
                    realMoney = getCost() - (getCost() * 25)/100;
                    return realMoney;
                }else {
                    realMoney = getCost() - (getCost() * 10)/100;
                    return realMoney;
                }
            }else{
                realMoney = getCost() - (getCost() *5)/100;
                return  realMoney;
            }
        } else{
            realMoney = getCost() - (getCost() * 50)/100;
            return realMoney;
        }
    }

    @Override
    public LocalDate getDiscount() {
        LocalDate discount = getImportDate().plusMonths(24);
        return discount;
    }
}
