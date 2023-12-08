public class Book extends Product{

    int id;
    double price;
    int stock;
    String name;
    String description;

    public Book(int id, String name, double price, int stock){
        super(name, price, stock);
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        System.out.println("Product -> " + name + " Price: " + price + " Stock: "+ stock);
    }

    public void display(){
        System.out.println("Product -> " + name + " Price: " + price + " Stock: "+ stock);
    }

    public void addDescription(String description){
        this.description = description;
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
