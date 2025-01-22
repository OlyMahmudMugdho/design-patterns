import product.Pizza;

public class BuilderClient {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .dough("some daugh..")
                .sauce("random sauce..")
                .toppings("whatever toppings..")
                .build();
        System.out.println(pizza.toString());
    }
}
