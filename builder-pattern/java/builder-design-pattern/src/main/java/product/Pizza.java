package product;

public class Pizza {
    private String dough;
    private String sauce;
    private String toppings;

    private Pizza(PizzaBuilder pizzaBuilder){
        this.dough = pizzaBuilder.dough;
        this.sauce = pizzaBuilder.sauce;
        this.toppings = pizzaBuilder.toppings;
    }

    @Override
    public String toString() {
        return "Pizza [dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + "]";
    }

    public static class PizzaBuilder{
        private String dough;
        private String sauce;
        private String toppings;

        public PizzaBuilder dough(String dough){
            this.dough = dough;
            return this;
        }

        public PizzaBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder toppings(String toppings){
            this.toppings = toppings;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
