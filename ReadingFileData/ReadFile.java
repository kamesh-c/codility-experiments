import java.io.BufferedReader;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.nio.charset.StandardCharsets;

public class ReadFile {
    
    public static void main(String[] args) {
        // Reading file and converting in to string array
        List<List<Integer>> data = readCSVData("test.csv");
        data.stream().forEach(m -> m.toString());
    }

    private static  List<List<Integer>> readCSVData(String file){
        List<List<Integer>> data = null;

        Path pathToFile = Paths.get(file);
        try  (BufferedReader br = Files.newBufferedReader(pathToFile,
        StandardCharsets.US_ASCII)){
            String line = br.readLine();
            System.out.println(line);
            data = new ArrayList<>();
            while (br != null){
                String[] attributes = line.split(",");
                
                List<Integer> lineData = Arrays.asList(attributes).stream().map(Integer::parseInt).collect(Collectors.toList());
                data.add(lineData);  
                line = br.readLine();            
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        return data;

    }
}
