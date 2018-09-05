public class BakeryItemDecoratorTest {

    public static void main(String[] args) {

        System.out.println("========== APPLE PIE ==========");
        BakeryItem applePie = new ApplePie();
        System.out.println(applePie.GetItemDescription() + " calories : " + applePie.GetCalories());
        System.out.println();

        System.out.println("========== CHOCOLATE CHIP COOKIES ==========");
        BakeryItem cookies = new ChocolateChipCookie();
        System.out.println(cookies.GetItemDescription() + " calories : " + cookies.GetCalories());
        System.out.println();

        System.out.println("========== GERMAN CAKE ==========");
        BakeryItem cake = new GermanCake();
        System.out.println(cake.GetItemDescription() + " calories : "  + cake.GetCalories());
        System.out.println();

        System.out.println("========== CHOCOLATE CHIP COOKIES with FROSTING ==========");
        BakeryItemDecorator frostingCookies = new Frosting(cookies);
        System.out.println(frostingCookies.GetItemDescription() + " calories : "  + frostingCookies.GetCalories());
        System.out.println();

        System.out.println("========== CHOCOLATE CHIP COOKIES with SPRINKLES ==========");
        BakeryItemDecorator sprinklesCookies = new Sprinkles(cookies);
        System.out.println(sprinklesCookies.GetItemDescription() + " calories : "  + sprinklesCookies.GetCalories());
        System.out.println();

        System.out.println("========== GERMAN CAKE with MARSHMELLOWS ==========");
        BakeryItemDecorator marshmellowCake = new Marshmellows(cake);
        System.out.println(marshmellowCake.GetItemDescription() + " calories : "  + marshmellowCake.GetCalories());
        System.out.println();
    }
}
