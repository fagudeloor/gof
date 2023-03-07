package gangs.of.four.structural.proxy.internet;

public class DefaultInternet implements Internet {

    @Override
    public void connectToHost(String url) {
        System.out.println("Connecting to " + url);
    }
}
