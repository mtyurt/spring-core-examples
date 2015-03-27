package lazyBean;

import javax.annotation.PostConstruct;

/**
 * Created by mt on 27.03.2015.
 */
public class HistoryMaterials {

    public static final String HISTORY_MATERIALS = "History materials";

    @PostConstruct
    public void postConstruct() {
        System.out.println(HISTORY_MATERIALS);
    }
}
