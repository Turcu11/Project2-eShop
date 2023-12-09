public class Main {
    public static void main(String[] args) {
        Book WritingSoftware = new Book(1,"Writing software", 12.5, 4);
        Laptop LenovoLegion = new Laptop(2,"Lenovo Legion", 5500, 6);

        eShop shop = eShop.getInstance();
        Seller seller1 = new Seller(1, "seller1", shop);
        Customer customer1 = new Customer(1, "customer1", "pass", new Cart(), shop);

        seller1.addProductsToOffer(WritingSoftware);
        seller1.addProductsToOffer(LenovoLegion);
        System.out.println("------------------------------------------------------------------------");
        customer1.addProductToCart(new Laptop(1,"HP", 4500, 1));
        customer1.addProductToCart(new Laptop(2, "AlienWare", 15000, 1));
        customer1.showCartContent();

        shop.registerSeller(seller1);
        customer1.getCartTotal();


    }
}