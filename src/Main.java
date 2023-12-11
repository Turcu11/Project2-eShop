public class Main {
    public static void main(String[] args) {
        Book WritingSoftware = new Book(1,"Writing software", 12.5, 4);
        Laptop LenovoLegion = new Laptop(2,"Lenovo Legion", 5500, 6);

        eShop shop = eShop.getInstance();
        Seller seller1 = new Seller(1, "seller1", shop);
        Customer customer1 = new Customer(1, "customer1", "pass", new Cart(), shop);

        seller1.addProductsToOffer(WritingSoftware);
        seller1.addProductsToOffer(LenovoLegion);
        shop.registerSeller(seller1);
        System.out.println("------------------------------------------------------------------------");
        shop.seeCurrentSellersOffers();
        customer1.addProductToCart(LenovoLegion, 3);
        customer1.addProductToCart(WritingSoftware, 1);
        customer1.showCartContent();
        System.out.println("------------------------------------------------------------------------");

        shop.seeCurrentSellersOffers();
        customer1.getCartTotal();

    }
}