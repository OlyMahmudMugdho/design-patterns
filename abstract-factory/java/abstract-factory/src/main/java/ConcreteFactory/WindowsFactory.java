package ConcreteFactory;

// 5. Concrete Factories

import AbstractFactory.GUIFactory;
import AbstractProduct.Button;
import AbstractProduct.Checkbox;
import ConcreteProduct.WindowsButton;
import ConcreteProduct.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
