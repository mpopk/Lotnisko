package foodDoor2Door;

public class HealthyShop implements Vendor{
    private String vendor;
    private String product;

    HealthyShop healthyShop = new HealthyShop(vendor, product);


    public HealthyShop(String vendor, String product) {
        this.vendor = this.vendor;
        this.product = this.product;

    }

    public String getVendor() {
        return vendor;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public void process(Product product, User user) {
        System.out.println("Vendor healthyShop" + ", " + user + "," + product);
    }
}
