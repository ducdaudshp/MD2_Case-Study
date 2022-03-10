import java.time.LocalDate;

public class Mouse extends TechnologyEquipment {
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
        return "mouse{" + super.toString()+
                "connect='" + connect + '\'' +
                ", weight=" + weight +
                '}';
    }
}
