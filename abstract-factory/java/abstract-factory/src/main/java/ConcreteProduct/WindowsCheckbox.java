package ConcreteProduct;

import AbstractProduct.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows-style checkbox");
    }
}