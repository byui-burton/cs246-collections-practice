import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileLoader loader = new FileLoader();
            loader.readBooks();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
