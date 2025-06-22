package sistem.app;

import java.io.File;

public class YouTube {
    public void video(String link) {
        String userHome = System.getProperty("user.home");
        String downloadsPath = userHome + File.separator + "Downloads";

        System.out.println("baixando o video: " + link);

        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "C:\\Program Files\\yt-dlp\\yt-dlp.exe",
                    "-x", "--audio-format", "mp3",
                    "-o", downloadsPath + File.separator + "%(title)s.%(ext)s",
                    link
            );
            builder.inheritIO();
            Process process = builder.start();
            process.waitFor();

            System.out.println("convertendo o video em MP3");
        } catch (Exception e) {
            System.out.println("Não foi possivel baixar o video: " + e.getMessage());
        }
    }
}
