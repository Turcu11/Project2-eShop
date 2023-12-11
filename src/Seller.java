import java.util.*;

public class Seller implements ISeller{

    private int id;
    private String name;
    private eShop shop;
    private Map<Integer, Product> availableOffer = new HashMap<>();

    public Seller(int id, String name, eShop shop){
        this.id = id;
        this.name = name;
        this.shop = shop;
    }

    public void addProductsToOffer(Product product){
        if(availableOffer.containsKey(product.getId())){
            System.out.println("Already have this product in the offer !");
            return;
        }
        availableOffer.put(product.getId(), product);
        Collection<Product> collection = availableOffer.values();
        Product[] valuesArray = collection.toArray(new Product[0]);
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void decrementStock(int id, int quantity){
        for(Map.Entry<Integer, Product> entry : availableOffer.entrySet()){
            if(entry.getKey() == id){
                entry.getValue().stock = entry.getValue().stock -quantity;
            }
        }
    }

    @Override
    public List<Product> getSellersOffer() {
        List<Product> productsList = new ArrayList<>();
        for(Map.Entry<Integer, Product> entry : availableOffer.entrySet()){
            productsList.add(entry.getValue());
            System.out.println("The product is: "+ entry.getValue().getName() + " and it has the id of: " + entry.getValue().getId() + " the stock is: " + entry.getValue().getStock());
        }
        return productsList;
    }
}
