package gangs.of.four.structural.proxy.lazy.initialitation;

import java.util.HashMap;

public interface ThirdPArtyYouTubeLib {

    public HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
