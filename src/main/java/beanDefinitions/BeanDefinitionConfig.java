package beanDefinitions;

import common.Book;
import common.HistoryBook;
import common.PhilosophyBook;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by mt on 27.03.2015.
 * Demonstrates the possible ways to create beans.
 *
 * The @ComponentScan annotation makes ApplicationContext search
 * for beans in the specified package.
 */
@ComponentScan(basePackages = "beanDefinitions")
public class BeanDefinitionConfig
{
    @Bean
    @Qualifier("histBook")
    public Book historyBook() {
        return new HistoryBook();
    }

    @Bean
    @Qualifier("philBook")
    public Book philosophyBook() {
        return new PhilosophyBook();
    }
}
