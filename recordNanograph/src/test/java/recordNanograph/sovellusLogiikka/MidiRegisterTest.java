package recordNanograph.sovellusLogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import recordNanograph.SovellusLogiikka.MidiRegister;

public class MidiRegisterTest {
    private MidiRegister testRegister;
    private String testPath;
    
    public MidiRegisterTest() {
        this.testPath = "TEST";
        this.testRegister = new MidiRegister(this.testPath);
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
    public void fileListInit(){
        
        assertTrue(this.testRegister.getfileNamesList().isEmpty());
        this.testRegister.addFilesToList("Testing");
        assertEquals(this.testRegister.getfileNamesList().get(0), "Testing");

    }
    
    @Test
    public void registerPath(){
        
        assertEquals(this.testRegister.getPath(), this.testPath);
        
    }
    
}
