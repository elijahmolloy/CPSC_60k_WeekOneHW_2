public class Marshmellows extends BakeryItemDecorator {

    BakeryItem bakeryItem;

    public Marshmellows(BakeryItem bakeryItem) {
        this.bakeryItem = bakeryItem;
    }

    @Override
    public String GetItemDescription() {
        return bakeryItem.GetItemDescription() + ", with marshmellows.";
    }

    @Override
    public int GetCalories() {
        return bakeryItem.GetCalories() + 50;
    }
}
