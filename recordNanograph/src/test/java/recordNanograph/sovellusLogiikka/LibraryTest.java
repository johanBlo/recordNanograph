package recordNanograph.sovellusLogiikka;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import recordNanograph.SovellusLogiikka.Library;

public class LibraryTest {
    private Library testLibrary;
    
    public LibraryTest() {
        this.testLibrary = new Library(new Scanner(System.in));
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void AlbumListaInit(){
        
        assertTrue(this.testLibrary.getAlbumList().isEmpty());
    
    }
}
