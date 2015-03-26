package conditional;

import org.springframework.stereotype.Component;

/**
 * Created by mt on 26.03.2015.
 */
@Component("hist")
public class HistoryClass implements CourseClass  {

    @Override
    public String courseName() {
        return "History";
    }
}
