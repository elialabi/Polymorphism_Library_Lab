import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    Library library;




    @BeforeEach
    public void setup(){
        ArrayList<String> stockList = new ArrayList<>();
        stockList.add("Bridge of Terabitha");
        library = new Library("Larry's Local Library", "Librarian", "Narnia, Fast & Furious, Life on Earth");
    }

    @Test
    public void testLibraryName(){

        assertThat(library.getLibraryName()).isEqualTo("Larry's Local Library");
    }

    @Test //meant to fail
    public void testLibraryNameIsIncorrect(){
        assertThat(library.getLibraryName()).isEqualTo("Alabi Local Pub");
    }

    @Test
    public void testStaff(){
        assertThat(library.getStaff()).isEqualTo("Librarian");
    }

    @Test //meant to fail
    public void testStaffIncorrect(){
        assertThat(library.getStaff()).isEqualTo("Doctor");
    }








    }

