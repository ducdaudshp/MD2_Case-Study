import java.time.LocalDate;

public class ComputerCase extends TechnologyEquipment {
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
        return "computerCase{" + super.toString()+
                "design='" + design + '\'' +
                '}';
    }
}
