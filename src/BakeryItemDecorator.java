public class BakeryItemDecorator extends BakeryItem {

    public String description = "Bakery Item Decorator";

    @Override
    public String GetItemDescription() { return description; }

    @Override
    public int GetCalories() {
        return 0;
    }
}
