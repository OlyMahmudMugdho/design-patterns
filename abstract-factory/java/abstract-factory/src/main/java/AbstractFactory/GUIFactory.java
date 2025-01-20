package AbstractFactory;

// 4. Abstract Factory Interface

import AbstractProduct.Button;
import AbstractProduct.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
