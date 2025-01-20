package ConcreteProduct;

import AbstractProduct.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a macOS-style button");
    }
}