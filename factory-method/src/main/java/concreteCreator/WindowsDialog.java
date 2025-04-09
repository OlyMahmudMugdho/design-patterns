package concreteCreator;

import concreteProduct.WindowsButton;
import creator.Dialog;
import product.Button;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
