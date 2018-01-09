package foodDoor2Door;

public class Order {

    Order createOrder = new Order();

    Vendor vendor = new Vendor() {

        @Override
        public void process(Product product, User user) {
        }
    };

    public Order(String michał, String extraFoodShop, String organic_oranges) {
    }

    public Order() {

    }

    public String createOrder(final User user, final Vendor vendor, final Product product) {

            return createOrder(user, vendor, product);
        }
    }








