package ds.designpattern.adapter;

/**
 * Created by skupunarapu on 12/24/2015.
 */
public class SocketAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120V() {
        return getVolt();
    }

    @Override
    public Volt get40V() {
        Volt v = getVolt();
        return convert(v, 3);
    }

    @Override
    public Volt get30V() {
        Volt v = getVolt();
        return convert(v, 4);
    }

    private Volt convert(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
