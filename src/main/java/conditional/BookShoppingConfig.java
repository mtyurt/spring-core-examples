package conditional;

import common.Book;
import common.PhilosophyBook;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mt on 26.03.2015.
 *
 * @Conditional annotation example.
 * All registered classes are defined as beans.
 */
@Configuration
@ComponentScan(basePackages = "conditional")
public class BookShoppingConfig {
    @Bean
    @Conditional(PhilosophyClassExistsCondition.class)
    public Book philosophyBook() {
        return new PhilosophyBook();
    }
}
