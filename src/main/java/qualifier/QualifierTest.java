package qualifier;

import common.HistoryBook;
import common.PhilosophyBook;
import common.PhsysicsBook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by mt on 26.03.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BookConfig.class)
public class QualifierTest {

    @Autowired
    CourseBooks courseBooks;

    @Test
    public void shouldSetBooks() {
        assertEquals(PhilosophyBook.COGITO_ERGO_SUM, courseBooks.getPhilosophyBook().talk());
        assertEquals(HistoryBook.ONCE_UPON_A_TIME, courseBooks.getHistoryBook().talk());
        assertEquals(PhsysicsBook.THIRD_LAW_OF_NEWTON, courseBooks.getPhysicsBook().talk());
    }
}
