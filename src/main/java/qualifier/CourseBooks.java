package qualifier;

import common.Book;
import common.Physics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mt on 26.03.2015.
 */
@Component
public class CourseBooks {
    private Book philosophyBook;
    private Book historyBook;
    private Book physicsBook;

    @Autowired
    public CourseBooks(@Qualifier("philBook") Book philosophyBook,
                       @Qualifier("histBook") Book historyBook,
                       @Physics Book physicsBook) {
        this.philosophyBook = philosophyBook;
        this.historyBook = historyBook;
        this.physicsBook = physicsBook;
    }

    public Book getPhilosophyBook() {
        return philosophyBook;
    }

    public Book getHistoryBook() {
        return historyBook;
    }

    public Book getPhysicsBook() {
        return physicsBook;
    }
}
