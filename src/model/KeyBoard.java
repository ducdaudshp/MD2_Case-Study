package model;

import java.time.LocalDate;

public class KeyBoard extends TechnologyEquipment implements Discount {
    private String button;

    public KeyBoard() {
    }

    public KeyBoard(String button) {
        this.button = button;
    }

    public KeyBoard(String id, String name, String color, String brand, LocalDate importDate, int amount, double cost, String button) {
        super(id, name, color, brand, importDate, amount, cost);
        this.button = button;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    @Override
    public String toString() {
        return "KeyBoard{" + super.toString()+
                "button='" + button + '\'' +
                '}';
    }

    @Override
    public double getRealMoney() {
        double realMoney;
        LocalDate discountDay = getDiscount();
        LocalDate discountMonth_10 = getDiscount().minusYears(2);
        LocalDate discountMonth_25 = getDiscount().minusYears(1);
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
            realMoney = getCost() - (getCost() * 45)/100;
            return realMoney;
        }
    }

    @Override
    public LocalDate getDiscount() {
        LocalDate discount = getImportDate().plusYears(3);
        return discount;
    }
}
