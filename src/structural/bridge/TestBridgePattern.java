package structural.bridge;

public class TestBridgePattern {

    public static void main(String[] args) {
        Spare product = new CentralLocking("Central Locking System");
        Spare product2 = new GearLocking("Gear Locking System");
        Car car = new BigWheelCar(product, "BigWheelCar xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new BigWheelCar(product2, "BigWheelCar xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println("-----------------------------------------------------");

        car = new MotorenCar(product, "MotorenCar lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new MotorenCar(product2, "MotorenCar lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

    }

}
