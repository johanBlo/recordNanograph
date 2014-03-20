package recordNanograph.sovellusLogiikka;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import recordNanograph.SovellusLogiikka.TrackList;

/**
 *
 * @author johanblo@cs
 */
public class TrackListTest {
    private TrackList test;
    private ArrayList<String> testList;
    private String testString = "Lolol";
    
    public TrackListTest() {
        this.test = new TrackList(new Scanner(System.in));
        this.testList = test.getTrackList();
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
    public void correctlyInitialized(){
        
        assertEquals(null, this.testList.get(0));
         
    }
    
    @Test
    public void addToList(){

        this.testList.add(this.testString);
        assertEquals(this.testList.get(this.testList.size()-1), testString);
        assertEquals(this.testList.get(1), testString);
        
    }
    
    @Test
    public void findTrack(){
        int i = 1;
        while(i <= 3){
            this.testList.add(this.testString);
            i++;
        }
        assertEquals(this.testList.get(2), this.testString);
        assertEquals(this.testList.get(3), this.testString);

        
    }
}
