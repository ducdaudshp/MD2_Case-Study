import java.time.LocalDate;

public class technologyEquipment {
    private String id;
    private String name;
    private String color;
    private String brand;
    private LocalDate importDate;
    private int amount;
    private double cost;

    public technologyEquipment() {
    }

    public technologyEquipment(String id, String name, String color, String brand, LocalDate importDate, int amount, double cost) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.importDate = importDate;
        this.amount = amount;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getImportDate() {
        return importDate;
    }

    public void setImportDate(LocalDate importDate) {
        this.importDate = importDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setImportDate(int year, int month, int day){
        this.importDate = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return "technologyEquipment{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", importDate=" + importDate +
                ", amount=" + amount +
                ", cost=" + cost +
                '}';
    }
}
