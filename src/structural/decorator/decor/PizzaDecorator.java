package structural.decorator.decor;

import structural.decorator.Pizza;

public abstract class PizzaDecorator implements Pizza {

    @Override
    public String getDesc() {
        return "Toppings";
    }

}
