import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String recipeUrl = "https://www.mako.co.il/food-cooking_magazine/keren_agam_bakery/Recipe-e4f14e6997f3871027.htm?sCh=a91539cdf3178110&pId=25483675";
        RecipeParser rp = new RecipeParser();
        try {
            rp.parse(recipeUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
