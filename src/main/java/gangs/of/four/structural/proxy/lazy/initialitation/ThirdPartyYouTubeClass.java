package gangs.of.four.structural.proxy.lazy.initialitation;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPArtyYouTubeLib {
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private int random(int min, int max){
        return min + (int) (Math.random() + ((max - min) + 1 ));

    }

    private void experienceNetworkLatency(){
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server){
        System.out.println("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.println("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos(){
        System.out.println("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<>();
        hmap.put("catzzzzzzzzz", new Video("dafadsfew", "catzzzzz.avi"));
        hmap.put("tgfesdfadsdf", new Video("iojadfkaj", "dog play with ball.mp4"));
        hmap.put("dancevideoo", new Video("dfrgdagdf", "Dancing video.mp4"));
        hmap.put("rtadfadwed", new Video("fesafdsfa", "Barcelona vs RealM.mov"));
        hmap.put("trrdfsadfr", new Video("faddffads", "programming lesson#1.avi"));

        System.out.println("Done!" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId){
        System.out.println("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "some video title");

        System.out.println("Done!" + "\n");
        return video;
    }


}
