import java.time.LocalDate;

public class screen extends technologyEquipment{
    private int size;
    private int resolution;

    public screen() {
    }

    public screen(int size, int resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public screen(String id, String name, String color, String brand, LocalDate importDate, int amount, double cost, int size, int resolution) {
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
        return "screen{" + super.toString()+
                "size=" + size +
                ", resolution=" + resolution +
                '}';
    }
}
