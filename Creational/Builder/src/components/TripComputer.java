package components;

import cars.Car;

/**
 * A component of Car
 */
public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println(String.format("Fuel level: %d", car.getFuel()));
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car is not started");
        }
    }
}
