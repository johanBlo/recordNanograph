package recordNanograph;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import recordNanograph.SovellusLogiikka.MainLoop;

public class MainTest02 {
    private MainLoop testOhjelma;
    
    public MainTest02() {
        
        this.testOhjelma = new MainLoop(new Scanner(System.in));
    
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
    
}
