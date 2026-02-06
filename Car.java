public class Car {
    private String model;
    private boolean isAvailable;

    public Car(String model) {
        this.model = model;
        this.isAvailable = true; // Cars are available by default
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }
}