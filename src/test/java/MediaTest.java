import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class MediaTest {

    Media media;

    @BeforeEach
    public void setup(){}



    @Test
    public void testTitleBeginWithA(){
    Media media1 = new Book("A Song of Ice and Fire", 0.00,"G.R.R.Martin", "Hardcover");
    Media media2 = new Film("Narnia", 0.00, "Joe Johnston", "James McAvoy");

    assertTrue(media1.titleBeginsWithA());
    assertFalse(media2.titleBeginsWithA());

    }

    @Test
    public void testSetItemToBeFreeToLoan(){
        Media media = new AudioItem("Harry Potter", 10.0, 12367543, "Viola Davis");
        media.setCostToZero();
        assertEquals(0.0,media.cost);
    }


}
