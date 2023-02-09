package web.model;

public class Car {
    private long id;
    private String manufacturer;

    private String model;

    private int serial_number;

    public Car() {
    }

    public Car(long id, String manufacturer, String model, int serial_number) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.serial_number = serial_number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    @Override
    public String toString() {
        return "Car: Serial number (" + serial_number + "), Manufacturer ("+ manufacturer + "), Model (" + model + ")";
    }
}
