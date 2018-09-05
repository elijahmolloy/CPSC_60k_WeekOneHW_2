public class Sprinkles extends BakeryItemDecorator {

    BakeryItem bakeryItem;

    public Sprinkles(BakeryItem bakeryItem) {
        this.bakeryItem = bakeryItem;
    }

    @Override
    public String GetItemDescription() {
        return bakeryItem.GetItemDescription() + ", with sprinkles.";
    }

    @Override
    public int GetCalories() {
        return bakeryItem.GetCalories() + 10;
    }
}
