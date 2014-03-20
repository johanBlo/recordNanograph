package recordNanograph.SovellusLogiikka;

import java.io.File;
import java.util.ArrayList;

public class MidiRegister {
    private String registerFilePath;
    private ArrayList<String> fileNames;
    private File registerFile;
    
    public MidiRegister(String FilePathInput){
        
        this.registerFilePath = FilePathInput;
        this.registerFile = new File(this.registerFilePath);
        this.fileNames = new ArrayList<String>();
    
    }
    
    public String getPath(){
        
        return this.registerFilePath;
   
    }
    
    public ArrayList<String> getfileNamesList(){
        
        return this.fileNames;
    
    }
    
    public void addFilesToList(String inputFileAdress){
        
        this.fileNames.add(inputFileAdress);
    
    }
    
    
}
