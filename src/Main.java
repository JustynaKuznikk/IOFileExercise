import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        //Opening file
        File file = new File("fragment.txt");
        FileReader reader = null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while (line = bufferedReader.readLine() != null){
            

        }

    }
}
