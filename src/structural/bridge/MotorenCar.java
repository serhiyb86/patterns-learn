package structural.bridge;

public class MotorenCar extends Car {

    private final Spare product;
    private final String carType;

    public MotorenCar(Spare product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + product.spareName() + " for " + carType);
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifing product " + product.spareName() + " according to " + carType);
    }

}
