package qualifier;

import common.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mt on 26.03.2015.
 */
@Configuration
@ComponentScan
public class BookConfig {

    @Bean
    @Qualifier("histBook")
    public Book historyBook()
    {
        return new HistoryBook();
    }

    @Bean
    @Qualifier("philBook")
    public Book philosophyBook()
    {
        return new PhilosophyBook();
    }

    @Bean
    @Physics
    public Book physicsBok()
    {
        return new PhysicsBook();
    }
}
