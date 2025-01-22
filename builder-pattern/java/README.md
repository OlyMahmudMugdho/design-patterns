# Pizza Builder Example

This repository demonstrates the **Builder Design Pattern** in Java by constructing a `Pizza` object using a nested `PizzaBuilder` class.

---

## Structure

### 1. **`Pizza` Class**
- Represents the product being built.
- Contains:
  - `dough` - Type of dough used.
  - `sauce` - Type of sauce.
  - `toppings` - List of toppings.
- **`PizzaBuilder` (Inner Static Class)**:
  - Handles the step-by-step creation of a `Pizza` object.
  - Provides a fluent API for customization.

### 2. **`BuilderClient` Class**
- Demonstrates how to use the `PizzaBuilder` to create a `Pizza` object.

---

## Code Explanation

### Pizza Class
The `Pizza` class contains private properties that are initialized using a builder.

```java
public class Pizza {
    private String dough;
    private String sauce;
    private String toppings;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.dough = pizzaBuilder.dough;
        this.sauce = pizzaBuilder.sauce;
        this.toppings = pizzaBuilder.toppings;
    }

    @Override
    public String toString() {
        return "Pizza [dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + "]";
    }
    
    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private String toppings;

        public PizzaBuilder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder toppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
```

### BuilderClient Class

The `BuilderClient` class shows how to use the builder to create and print a `Pizza` object.

```java
import product.Pizza;

public class BuilderClient {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .dough("some dough..")
                .sauce("random sauce..")
                .toppings("whatever toppings..")
                .build();

        System.out.println(pizza.toString());
    }
}
```

## How to Run

1. **Compile the Code**:

    ```bash
    javac -d . Pizza.java BuilderClient.java
    ```

2. **Run the Client**:

    ```bash
    java product.BuilderClient
    ```

---

## Output

When you run the program, the output will be:

```bash
Pizza [dough=some dough.., sauce=random sauce.., toppings=whatever toppings..]
