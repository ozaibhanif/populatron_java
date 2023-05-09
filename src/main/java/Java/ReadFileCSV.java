import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileCSV {
    private List<String> lines;
    public ReadFileCSV(String pathz){
        try{
            String path = pathz;
            lines = Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);
        }
        catch(IOException ex){
            System.out.println("Exception in reading csv file");
        }
    }

    public List<String> getFileData(){
        return lines;
    }
}