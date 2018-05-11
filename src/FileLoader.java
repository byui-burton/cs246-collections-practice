import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * The purpose of this class is to load information from files to
 * be processed in different collections, etc.
 */
public class FileLoader {

    public List<String> readBooks() throws IOException {

        String filename = "booksAndChapters.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(":");
                String book = parts[0];
                int chapters = Integer.parseInt(parts[1]);

                System.out.println(String.format("%s - %d", book, chapters));
            }

        }

        // TODO: Change this to return a list
        return null;
    }
}
