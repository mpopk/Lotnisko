package foodDoor2Door;

public class GlutenFreeShop implements Vendor{


    private String vendor;
    private String product;


    GlutenFreeShop glutenFreeShop = new GlutenFreeShop(vendor, product);


    public String getVendor() {
        return vendor;
    }

    public String getProduct() {
        return product;
    }


    public GlutenFreeShop(String vendor, String product) {
        this.vendor = vendor;
        this.product = product;
    }

    @Override
    public void process(Product product, User user) {
        System.out.println("Vendor glutenFreeShop " +  "," + user + "," + product);
    }
}
