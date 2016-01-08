package entities;

public class Purchase {

    private Provider provider;

    private WrittenWork product;

    public Purchase(Provider provider, WrittenWork product) {
        this.provider = provider;
        this.product = product;
    }

    public double getPrice() {
        return product.getPrice();
    }
}
