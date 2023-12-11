import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class eShop implements IeShop{

    private static volatile eShop instance;
    private eShop(){
        this.notificationService = new NotificationService();
    }

    public static eShop getInstance(){
        if(instance == null){
            synchronized (eShop.class){
                if(instance == null){
                    instance = new eShop();
                }
            }
        }
        return instance;
    }

    private final NotificationService notificationService;
    Map<Integer, ISeller> sellersList = new HashMap<>();
    Map<Integer, ICustomer> customersList = new HashMap<>();

    @Override
    public void registerSeller(ISeller seller) {
        if(sellersList.containsKey(seller.getId())){
            System.out.println("This seller is already added in ! id: "+seller.getId());
            return;
        }
        sellersList.put(seller.getId(), seller);
    }

    @Override
    public void registerCustomer(ICustomer customer) {
        if(customersList.containsKey(customer.getId())){
            System.out.println("This customer is already added in ! id: "+customer.getId());
            return;
        }
        customersList.put(customer.getId(), customer);
    }

    public void seeCurrentSellersOffers(){
        for(Map.Entry<Integer, ISeller> entry : sellersList.entrySet()){
            entry.getValue().getSellersOffer();
        }
    }

    public void handleOrder(ICustomer customer, Cart cart){
        List<Product> cartList = cart.getCartContent();

        for (Product product : cartList) {
            for (Map.Entry<Integer, ISeller> entry : sellersList.entrySet()) {
                ISeller seller = entry.getValue();
                if (seller.getSellersOffer().contains(product)) {
                    seller.decrementStock(product.getId(), product.getStock());
                }
            }
        }
    }
}
