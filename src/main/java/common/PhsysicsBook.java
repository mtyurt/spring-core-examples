package common;

/**
 * Created by mt on 26.03.2015.
 */
public class PhsysicsBook implements Book {

    public static final String THIRD_LAW_OF_NEWTON = "Third law of Newton is...";

    @Override
    public String talk() {
        return THIRD_LAW_OF_NEWTON;
    }
}
