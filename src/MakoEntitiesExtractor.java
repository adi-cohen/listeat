import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class MakoEntitiesExtractor implements EntitiesExtractor{

    @Override
    public Elements getIngredientsElement(Document doc) {
        Elements lms;
        lms = doc.selectFirst("div.ingredients").children();
        return lms;
    }

    @Override
    public Elements getIngredientsElements(Elements list) {
        return list.select("[itemprop = recipeIngredient]");
    }

    @Override
    public List<String> getIngredientsList(Elements lm_list) {
        List<String> ingList = new ArrayList<String>();
        for (Element item : lm_list) {
            ingList.add(item.text());
        }
        return ingList;
    }
}
