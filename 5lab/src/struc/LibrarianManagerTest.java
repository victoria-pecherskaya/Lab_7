package struc;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
import java.util.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LibrarianManagerTest {
    private String inputName;
    private String expectedName;


    public LibrarianManagerTest(String inputName, String expectedName){
        this.inputName = inputName;
        this.expectedName = expectedName;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        Employee librarian1 = new Librarian("Elena Ivanova", 854.52);
        Employee librarian2 = new Librarian("Maxim Moledin", 4523.1);
        Employee librarianManager = new LibrarianManager("Irina Osipova",41325.1);

        return Arrays.asList(new Object[][]{
                {librarian1.getName(), "Elena Ivanova"},
                {librarian2.getName(), "Maxim Moledin"},
                {librarianManager.getName(), "Irina Osipova"},
        });
    }

    @Test
    public void valueOfVisiting(){
        System.out.println("Input name is " + inputName);
        assertEquals(expectedName, inputName );

    }

}