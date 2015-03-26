package profiling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by mt on 26.03.2015.
 */

@Configuration
public class BookConfig {

    @Bean
    @Profile("hist")
    public Book bookie() {
        return new HistoryBook();
    }

    @Bean
    @Profile("phil")
    public Book philosophy() {
        return new PhilosophyBook();
    }
}
