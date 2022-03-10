import java.time.LocalDate;

public class KeyBoard extends TechnologyEquipment {
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
        return "keyBoard{" + super.toString()+
                "button='" + button + '\'' +
                '}';
    }
}
