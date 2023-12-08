import java.util.List;

public abstract class Product implements Box {
    protected String name;
    protected double price;
    protected int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public int getStock(){
        return stock;
    }
    public String getName(){
        return name;
    }

    public Product() {

    }
}
