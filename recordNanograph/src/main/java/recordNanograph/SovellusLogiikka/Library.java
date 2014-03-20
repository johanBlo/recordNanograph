package recordNanograph.SovellusLogiikka;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Album> albumList;
    private Scanner reader;
    private MidiRegister midiRegister;
    
    public Library(Scanner inputReader){
        
        this.reader = new Scanner(System.in);
        
        this.albumList = new ArrayList<Album>();
        this.midiRegister = new MidiRegister("");
    }
        
    public void addAlbum(String albumTitle){
        
        Album addingAlbum = new Album(albumTitle);
        
        addingAlbum.addTrackList();                  
        this.albumList.add(addingAlbum);             
        
    }
    
    
    
    public void PrintAlbumsInLibrary(){
        
        System.out.println("Titles of albums in current library:");
        
        for(Album currentAlbum: this.albumList){
            
            System.out.println(currentAlbum.getAlbumTitle());
            
        }
        
    }
    
    public ArrayList<Album> getAlbumList(){
        
        return this.albumList;
    
    }
    
      
}
