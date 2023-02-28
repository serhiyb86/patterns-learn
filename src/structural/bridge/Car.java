package structural.bridge;

public abstract class Car {

    private final Spare spare;
    private final String carType;

    public Car(Spare spare, String carType) {
        this.spare = spare;
        this.carType = carType;
    }

    public abstract void assemble();

    public abstract void produceProduct();

    public void printDetails() {
        System.out.println("Car: " + carType + ", Spare:" + spare.spareName());
    }
}
