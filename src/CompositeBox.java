import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box {

    int id;
    private final List<Box> items = new ArrayList<>();

    public CompositeBox(Box... boxes) {
        items.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrice() {
        System.out.println("The total price of the box is : " + items.stream().mapToDouble(Box::calculatePrice).sum());
        return items.stream().mapToDouble(Box::calculatePrice).sum();
    }

    @Override
    public int getId() {
        return this.id;
    }
}
