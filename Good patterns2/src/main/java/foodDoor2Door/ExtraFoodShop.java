package foodDoor2Door;

public class ExtraFoodShop implements Vendor{

    private String vendor;
    private String product;


    ExtraFoodShop extraFoodShop = new ExtraFoodShop(vendor, product);

    public ExtraFoodShop getExtraFoodShop() {
        return extraFoodShop;
    }

    public String getVendor() {
        return vendor;
    }

    public String getProduct() {
        return product;
    }


    public ExtraFoodShop(String vendor, String product){
        this.vendor = vendor;
        this.product = product;
    }

    @Override
    public void process(Product product, User user) {
        System.out.println("Vendor ExtraFoodShop " + "," + user + "," + product);
    }
}

