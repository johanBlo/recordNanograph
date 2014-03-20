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

    }
    
    public void addTrackList(){
        
        this.albumTrackList.addTracks();
    
    }
    
    public void addTrackList(String TrackTitleIn){
        
        this.albumTrackList.addTracks(TrackTitleIn);
        
    }
    
    public ArrayList<String> getTrackList(){
        
        return this.getTrackList();
    
    }
    
    public String getAlbumTitle(){
        
        return this.albumTitle;
    
    }
       
}
