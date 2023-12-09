import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Integer, Product> cartContent = new HashMap<>();

    public void addProductToCart(Product product){
        if(cartContent.containsKey(product.getId())){
            System.out.println("The product is already added for this id !! DUPLICATE ID:" + product.getId());
            return;
        }
        cartContent.put(product.getId(), product);
    }

    double getCartTotal(){
        System.out.println("The total price of the box is : " + cartContent.values().stream().mapToDouble(Box::calculatePrice).sum());
        return cartContent.values().stream().mapToDouble(Box::calculatePrice).sum();
    }

    public void showCartContent(){
        for(Map.Entry<Integer, Product> entry : cartContent.entrySet()){
            System.out.println("The product in the shopping cart is: "+ entry.getValue().getName() + " and it has the id of: " + entry.getValue().getId() + " and the quantity is: " + entry.getValue().getStock());
        }
    }
}
