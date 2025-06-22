package sistem.app;

import sistem.interfaces.IMP3;

public class Conversor implements IMP3 {
    private YouTube youTube;

    public Conversor() {
        this.youTube = new YouTube();
    }

    @Override
    public void MP3(String link) {
        youTube.video(link);
    }
}
