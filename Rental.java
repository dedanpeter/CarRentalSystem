public class Rental {
    private Car car;
    private String username;

    public Rental(Car car, String username) {
        this.car = car;
        this.username = username;
    }

    public Car getCar() {
        return car;
    }

    public String getUsername() {
        return username;
    }
}