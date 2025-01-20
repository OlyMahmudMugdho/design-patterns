package ConcreteFactory;

import AbstractFactory.GUIFactory;
import AbstractProduct.Button;
import AbstractProduct.Checkbox;
import ConcreteProduct.MacOSButton;
import ConcreteProduct.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}