public class Main {
    public static void main(String[] args) {
        Book WritingSoftware = new Book(1,"Writing software", 12.5, 4);
        Laptop LenovoLegion = new Laptop(2,"Lenovo Legion", 5500, 6);

        eShop shop = eShop.getInstance();
        Seller seller1 = new Seller(1, "seller1", shop);

        seller1.addProductsToOffer(WritingSoftware);
        seller1.addProductsToOffer(LenovoLegion);
        seller1.getSellersOffer();


        shop.registerSeller(seller1);
    }
}