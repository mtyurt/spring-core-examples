package common;

/**
 * Created by mt on 26.03.2015.
 */


public class PhilosophyBook implements Book {

    public static final String COGITO_ERGO_SUM = "Cogito ergo sum";

    @Override
    public String talk() {
        return COGITO_ERGO_SUM;
    }
}
