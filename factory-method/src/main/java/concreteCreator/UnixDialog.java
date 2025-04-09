package concreteCreator;

import concreteProduct.UnixButton;
import creator.Dialog;
import product.Button;

public class UnixDialog extends Dialog {
    @Override
    public Button createButton() {
        return new UnixButton();
    }
}
