package profiling;

/**
 * Created by mt on 26.03.2015.
 */

public class HistoryBook implements Book {

    public static final String ONCE_UPON_A_TIME = "Once upon a time...";

    @Override
    public String talk() {
        return ONCE_UPON_A_TIME;
    }
}
