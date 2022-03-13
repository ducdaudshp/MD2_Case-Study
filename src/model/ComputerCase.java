package model;

import java.time.LocalDate;

public class ComputerCase extends TechnologyEquipment implements Discount{
    private String design;

    public ComputerCase() {
    }

    public ComputerCase(String design) {
        this.design = design;
    }

    public ComputerCase(String id, String name, String color, String brand, LocalDate importDate, int amount, double cost, String design) {
        super(id, name, color, brand, importDate, amount, cost);
        this.design = design;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    @Override
    public String toString() {
        return "ComputerCase{" + super.toString()+
                "design='" + design + '\'' +
                '}';
    }

    @Override
    public LocalDate getDiscount() {
        LocalDate discount = getImportDate().plusYears(5);
        return discount;
    }


    @Override
    public double getRealMoney() {
        double realMoney;
        LocalDate discountDay = getDiscount();
        LocalDate discountMonth_8 = getDiscount().minusYears(3);
        LocalDate discountMonth_15 = getDiscount().minusYears(2);
        LocalDate today = LocalDate.now();
        if (today.isBefore(discountDay)){
            if (today.isAfter(discountMonth_8)){
                if (today.isAfter(discountMonth_15)){
                    realMoney = getCost() - (getCost() * 15)/100;
                    return realMoney;
                }else {
                    realMoney = getCost() - (getCost() * 8)/100;
                    return realMoney;
                }
            }else{
                realMoney = getCost() - (getCost() *5)/100;
                return  realMoney;
            }
        } else{
            realMoney = getCost() - (getCost() * 40)/100;
            return realMoney;
        }
    }
}
