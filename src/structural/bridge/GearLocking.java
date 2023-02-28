package structural.bridge;

public class GearLocking implements Spare {

    private final String productName;

    public GearLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String spareName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }

}
