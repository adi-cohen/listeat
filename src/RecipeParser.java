import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RecipeParser {

    public void parse(String url) throws Exception {
        String fixed_url = url.toLowerCase();
        // Check which recipes site the URL refers to.
        String hostname = this.checkDomain(fixed_url);
        // Get the whole HTML tree elements.
        Document doc = Jsoup.connect(url).get();
        EntitiesExtractor ex;

        switch (hostname) {
            case "mako":
                ex = new MakoEntitiesExtractor();
                Elements ing = ex.getIngredientsElement(doc);
                Elements ing_list = ex.getIngredientsElements(ing);
                // Parse recipe to lines.
                List<String> list = ex.getIngredientsList(ing_list);
                break;

            case "recipes_2":
                break;

            case "recipes_3":
                break;

            case "recipes_4":
                break;

            default:
                throw new IllegalArgumentException("Recipe url is not supported");
        }


    }

    public String checkDomain(String url_str) throws MalformedURLException {
        URL aUrl = new URL(url_str);

        // return host name of the url
        return aUrl.getHost().split("\\.")[1];

    }


}

