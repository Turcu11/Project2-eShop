public class Customer implements ICustomer{
    private int id;
    private String name;
    private String pass;

    private Cart cart;
    private eShop shop;

    public Customer(int id, String name, String pass, Cart cart, eShop shop){
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.cart = cart;
        this.shop = shop;
    }

    void addProductToCart(Product product){
        cart.addProductToCart(product);
    }

    double getCartTotal(){
        return cart.getCartTotal();
    }

    void showCartContent(){
        cart.showCartContent();
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPass() {
        return this.pass;
    }
}
