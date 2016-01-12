package ds.designpattern.structural.adapter;

/**
 * Created by skupunarapu on 12/24/2015.
 */
public interface SocketAdapter {
    Volt get120V();
    Volt get40V();
    Volt get30V();
}
