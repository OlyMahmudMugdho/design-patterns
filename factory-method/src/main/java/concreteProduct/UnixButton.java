package concreteProduct;

import product.Button;

public class UnixButton implements Button {
    @Override
    public void click(){
        System.out.println("Unix button clicked...");
    }
}
