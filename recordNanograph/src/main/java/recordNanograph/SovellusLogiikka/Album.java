package recordNanograph.SovellusLogiikka;

import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    
    private String albumTitle;
    private Scanner lukija = new Scanner(System.in);
    private TrackList albumTrackList;
    
    public Album(String albumTitleInput){
        
        this.albumTitle = albumTitleInput;
        this.albumTrackList = new TrackList(this.lukija);
        this.albumTrackList.addTracks();
        
    }
       
}
