public class Customer implements ICustomer{
    private int id;
    private String name;
    private String pass;




    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPass() {
        return this.pass;
    }
}
