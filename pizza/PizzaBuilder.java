package pizza;

import orders.Order;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements IPizzaBuilder {

    private String topping;
    private String size;
    private ArrayList<String> toppings = new ArrayList<String>();


    @Override
    public void addTopping(String topping) {

        this.topping = topping;
        toppings.add(topping);

    }

    @Override
    public void setSize(String size) {

        this.size = size;
    }

    @Override
    public Pizza getPizza() {

        return new Pizza(size, toppings);
    }
}
