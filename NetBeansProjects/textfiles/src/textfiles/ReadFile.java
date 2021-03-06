
package textfiles;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    private String path;
    
    int readLines() throws IOException {
       FileReader file_to_read = new FileReader(path); 
       BufferedReader bf = new BufferedReader(file_to_read);
       
       String aline;
       int numberOfLines = 0;
       
       while (( aline = bf.readLine()) != null) {
               numberOfLines++;
       }
       bf.close();
       
       return numberOfLines;
    }
    
    public ReadFile(String file_path) {
        path = file_path;
    }
    
    public String[] OpenFile() throws IOException {
        
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader (fr);
        
        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];
        
        int i;
        
        for (i=0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }
        
        textReader.close();
        return textData;
    }
}
