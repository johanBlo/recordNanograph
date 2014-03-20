package recordNanograph;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KirjautuminenTest {
    private Kirjautuminen kirjaudus;
    
    public KirjautuminenTest() {
        this.kirjaudus = new Kirjautuminen(new Scanner(System.in));
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
    public void KirajutumisenVirheet(){
        assertTrue(this.kirjaudus.passwordTest("admin"));
        assertTrue(this.kirjaudus.usernameTest("admin"));
        assertFalse(this.kirjaudus.passwordTest("1"));
        assertFalse(this.kirjaudus.usernameTest(""));
        
    }
}
