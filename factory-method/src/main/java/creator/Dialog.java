package creator;

import product.Button;

public abstract class Dialog {
    public abstract Button createButton();

    public void showDialog() {
        Button okButton = createButton();
        okButton.click();
    }
}
