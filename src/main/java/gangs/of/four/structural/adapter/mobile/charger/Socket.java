package gangs.of.four.structural.adapter.mobile.charger;


public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
