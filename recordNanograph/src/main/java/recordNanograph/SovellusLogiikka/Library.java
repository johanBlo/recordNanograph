package recordNanograph.SovellusLogiikka;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Album> albumList;
    private Scanner reader;
    
    public Library(Scanner inputReader){
        
        this.albumList = new ArrayList<Album>();
        this.reader = new Scanner(System.in);
    
    }
    
    public void addAlbum(){
                        
        System.out.print("Album Title: ");
        String albumTitle = this.reader.nextLine();
        this.albumList.add(new Album(albumTitle));         //Polymorfismillä luodaan monta eri oliota
    
    }
    
      
}
