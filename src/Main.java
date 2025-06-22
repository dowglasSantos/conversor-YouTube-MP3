import sistem.app.Conversor;
import sistem.app.YouTube;

public class Main {
    public static void main(String[] args) {
        System.out.println("conversor de videos do youtube em MP3");

        String link = "https://youtu.be/mGe491o71tA";

        Conversor conversor = new Conversor();
        conversor.MP3(link);

    }
}