import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class JsonParser {
    JsonParser(String path){
        this.path = path;
    }
    public Person[] parse(){
        try(FileReader reader = new FileReader(path)) {
            Gson json = new Gson();
            return json.fromJson(reader, Person[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private final String path;
}
