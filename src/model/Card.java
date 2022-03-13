package model;

import java.time.LocalDate;

public class Card extends TechnologyEquipment implements Discount{
    private String nameOfCard;

    public Card() {
    }

    public Card(String nameOfCard) {
        this.nameOfCard = nameOfCard;
    }

    public Card(String id, String name, String color, String brand, LocalDate importDate, int amount, double cost, String nameOfCard) {
        super(id, name, color, brand, importDate, amount, cost);
        this.nameOfCard = nameOfCard;
    }

    public String getNameOfCard() {
        return nameOfCard;
    }

    public void setNameOfCard(String nameOfCard) {
        this.nameOfCard = nameOfCard;
    }

    @Override
    public String toString() {
        return "Card{" + super.toString()+
                "nameOfCard='" + nameOfCard + '\'' +
                '}';
    }

    @Override
    public double getRealMoney() {
        double realMoney;
        LocalDate discountDay = getDiscount();
        LocalDate discountMonth_10 = getDiscount().minusYears(2);
        LocalDate discountMonth_20 = getDiscount().minusYears(1);
        LocalDate today = LocalDate.now();
        if (today.isBefore(discountDay)){
                if (today.isAfter(discountMonth_10)){
                    if (today.isAfter(discountMonth_20)){
                        realMoney = getCost() - (getCost() * 20)/100;
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
                       realMoney = getCost() - (getCost() * 35)/100;
                       return realMoney;
                }
            }

    @Override
    public LocalDate getDiscount() {
        LocalDate discount = getImportDate().plusYears(3);
        return discount;
    }
}
