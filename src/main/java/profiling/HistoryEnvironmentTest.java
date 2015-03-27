package profiling;

import common.Book;
import common.HistoryBook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by mt on 26.03.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BookEnvironmentConfig.class)
@ActiveProfiles("hist")
public class HistoryEnvironmentTest {

    @Autowired
    public Book book;

    @Test
    public void shouldInitializeHistoryBook() {
        assertEquals( book.talk(), HistoryBook.ONCE_UPON_A_TIME);
    }

}
