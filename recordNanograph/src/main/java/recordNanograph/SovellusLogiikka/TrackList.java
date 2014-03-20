package recordNanograph.SovellusLogiikka;

import java.util.ArrayList;
import java.util.Scanner;

public class TrackList {
    private ArrayList<String> trackList;
    private Scanner reader;
    
    public TrackList(Scanner readerInput){
        this.reader = readerInput;
        this.trackList = new ArrayList<String>();
        this.trackList.add(null);
    }
    
   public void addTracks(){
 
        System.out.println("Enter the titles of tracks in numerical order or press [ENTER] to save & quit: ");
        int loopCounter = 1;
        while(true){
            System.out.print(""+loopCounter+". ");
            String trackTitle = this.reader.nextLine();
            
            if (trackTitle.isEmpty()){            
                break;
            }
            else{
                this.trackList.add(trackTitle);
                loopCounter++;
            }
            
        }
    }
   
    public String findTrack(int trackNumber){
        return this.trackList.get(trackNumber);
    }
}
