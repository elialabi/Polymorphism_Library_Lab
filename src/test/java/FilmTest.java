import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {

    Film film;

    @BeforeEach
    public void setup(){
//        film = new Film("Get Out", 0.00, "Jorndan Peele", "Daniel Kaluuya");
    }

    @Test
    public void testCountFilm(){
        Film[] films = new Film[3];
        films[0] = new Film("Film1", 0.0, "Director1", "Ryan Reynolds");
        films[1] = new Film("Film2", 0.0, "Director2", "Ryan Murphy");
        films[2] = new Film("Film3", 0.0, "Director3", "Ryan Gosling");

        int expected = 3;
        int actual = Film .countFilms(films);

        assertEquals(expected,actual);
    }

    @Test
    public void testPlay(){
        film = new Film("Get Out ", 0.00, "Jorndan Peele ", "Daniel Kaluuya ");
        String expectedTitle = "Get Out ";
        String actualTitle = film.play();
        assertEquals(expectedTitle, actualTitle);
        System.out.println( expectedTitle +  actualTitle );

    }

    @Test
    public void canPlayWithWarning(){
        film = new Film("Get Out ", 0.00, "Jorndan Peele ", "Daniel Kaluuya ");
        String expected = "This film contains, strong language and violence.";
        String actual = film.play("strong language and violence");
        assertThat(actual).isEqualTo(expected);

    }

}
