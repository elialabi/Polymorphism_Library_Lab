import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AudioItemTest {

    AudioItem audioItems;

@BeforeEach
    public void setUp(){
    audioItems = new AudioItem("Life on Earth", 0.00, 1232345, "David Attenborough");

}

@Test
    public void testVoiceActors(){
    assertEquals("David Attenborough", audioItems.getVoiceActors());
}

@Test
    public void testISBN(){
    assertEquals(1232345, audioItems.getISBN());
}
}

