package structural.bridge;

public class BigWheelCar extends Car {

    private final Spare spare;
    private final String carType;

    public BigWheelCar(Spare spare, String carType) {
        super(spare, carType);
        this.spare = spare;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + spare.spareName() + " for " + carType);
    }

    @Override
    public void produceProduct() {
        spare.produce();
        System.out.println("Modifing product " + spare.spareName() + " according to " + carType);
    }

}
