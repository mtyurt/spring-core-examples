package beanDefinitions;

import common.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by mt on 27.03.2015.
 */
@Component  //MathBook is a bean now.
@Qualifier("mathBook")
public class MathBook implements Book {

    public static final String ONE_OVER_X_WHEN_X_GOES_TO_INFINITY = "1 over x when x goes to infinity is...";
    public static final int MATERIAL_COUNT = 3;

    @Bean
    public MathMaterials materials() {
        return new MathMaterials(MATERIAL_COUNT);
    }

    @Override
    public String talk() {
        return ONE_OVER_X_WHEN_X_GOES_TO_INFINITY;
    }
}
