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

    void addProductToCart(Product product, int quantity){
        cart.addProductToCart(product, quantity);
    }

    double getCartTotal(){
        return cart.getCartTotal();
    }

    void order(Cart cart){
        shop.handleOrder(this, cart);
    }

    void showCartContent(){
        cart.getCartContent();
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
