public class Frosting extends BakeryItemDecorator {

    BakeryItem bakeryItem;

    public Frosting(BakeryItem bakeryItem) {
        this.bakeryItem = bakeryItem;
    }

    @Override
    public String GetItemDescription() {
        return bakeryItem.GetItemDescription() + ", with frosting.";
    }

    @Override
    public int GetCalories() { return bakeryItem.GetCalories() + 100; }
}
