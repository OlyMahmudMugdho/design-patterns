import AbstractFactory.GUIFactory;
import AbstractProduct.Button;
import AbstractProduct.Checkbox;
import ConcreteFactory.MacOSFactory;
import ConcreteFactory.WindowsFactory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        // Choose the factory based on configuration (e.g., OS)
        String os = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else if (os.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            System.out.println("Unknown OS. Using default Windows factory.");
            factory = new WindowsFactory(); // Default
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();

        //Demonstrates creating another set of UI elements from a different factory
        GUIFactory macFactory = new MacOSFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();

        macButton.paint();
        macCheckbox.paint();
    }
}