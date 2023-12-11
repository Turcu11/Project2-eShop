import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    Map<Integer, Product> cartContent = new HashMap<>();

    public void addProductToCart(Product product, int quantity){
        if(cartContent.containsKey(product.getId())){
            System.out.println("The product is already added for this id !! DUPLICATE ID:" + product.getId());
            return;
        }
        product.stock = quantity;
        cartContent.put(product.getId(), product);
    }  public void removeProductFromCart(Product product){
        if(cartContent.containsKey(product.getId())){
            cartContent.remove(product.getId(), product);
            return;
        }
        System.out.println("The product with the ID: " + product.getId() + " was not found, please try some other id.");
    }

    double getCartTotal(){
        System.out.println("The total price of the box is : " + cartContent.values().stream().mapToDouble(Box::calculatePrice).sum());
        return cartContent.values().stream().mapToDouble(Box::calculatePrice).sum();
    }

    public List<Product> getCartContent(){
        List<Product> productsList = new ArrayList<>();
        for(Map.Entry<Integer, Product> entry : cartContent.entrySet()){
            productsList.add(entry.getValue());
            System.out.println("The product in the shopping cart is: "+ entry.getValue().getName() + " and it has the id of: " + entry.getValue().getId() + " and the quantity is: " + entry.getValue().getStock());
        }
        return productsList;
    }
}
