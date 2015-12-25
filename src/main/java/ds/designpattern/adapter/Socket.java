package ds.designpattern.adapter;

/**
 * Created by skupunarapu on 12/24/2015.
 */
public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
