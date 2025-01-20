package ConcreteProduct;

import AbstractProduct.Button;

// 2. Concrete Products for Windows
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows-style button");
    }
}