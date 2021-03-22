import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public interface EntitiesExtractor {
    public Elements getIngredientsElement(Document doc);

    public Elements getIngredientsElements(Elements list);

    public List<String> getIngredientsList(Elements lm_list);
}
