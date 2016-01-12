package ds.designpattern.structural.adapter;

/**
 * Created by skupunarapu on 12/24/2015.
 */
public class AdapterPatternTest {
    public static void main(String[] args) {

        testClassAdapter();
    }

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketAdapterImpl();
        Volt v30 = getVolt(sockAdapter,4);
        Volt v40 = getVolt(sockAdapter,3);
        Volt v120 = getVolt(sockAdapter,1);
        System.out.println("v30 volts using Class Adapter="+v30.getVolts());
        System.out.println("v40 volts using Class Adapter=" +v40.getVolts());
        System.out.println("v120 volts using Class Adapter="+v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i){
            case 4: return sockAdapter.get30V();
            case 3: return sockAdapter.get40V();
            case 1: return sockAdapter.get120V();
            default: return sockAdapter.get120V();
        }
    }
}
