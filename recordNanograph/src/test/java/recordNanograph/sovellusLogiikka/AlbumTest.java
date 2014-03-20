package recordNanograph.sovellusLogiikka;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import recordNanograph.SovellusLogiikka.Album;

public class AlbumTest {
    private Album album;
    
    public AlbumTest() {

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
    public void correctAlbumTitle(){
        
        String albumTitle = "TestRecord";
        this.album = new Album(albumTitle);
        assertEquals(this.album.getAlbumTitle(),albumTitle);
        
    }
    
//    @Test
//    public void correctTrackListAdding(){
//        
//        this.album.addTrackList("TestTrack");
//        ArrayList<String> testTracklist = this.album.getTrackList();
//        assertEquals(testTracklist.get(testTracklist.size()), "TestTrack");
//        
//    }
}
