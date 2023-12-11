import java.util.List;

public interface ISeller {

    int getId();
    List<Product> getSellersOffer();

    void decrementStock(int id, int quantity);
}
