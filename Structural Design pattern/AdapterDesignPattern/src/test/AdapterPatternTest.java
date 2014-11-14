package test;

import adapter.SocketAdapter;
import adapter.SocketClassAdapterImpl;
import adapter.Volt;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt volt3 = getVolt(socketAdapter, 3);
        Volt volt12 = getVolt(socketAdapter, 12);
        Volt volt240 = getVolt(socketAdapter, 240);
        System.out.println(" Volts using Class Adapter: " + volt3.getVolts());
        System.out.println(" Volts using Class Adapter: " + volt12.getVolts());
        System.out.println(" Volts using Class Adapter: " + volt240.getVolts());
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt volt3 = getVolt(socketAdapter, 3);
        Volt volt12 = getVolt(socketAdapter, 12);
        Volt volt240 = getVolt(socketAdapter, 240);
        System.out.println(" Volts using Object Adapter: " + volt3.getVolts());
        System.out.println(" Volts using Object Adapter: " + volt12.getVolts());
        System.out.println(" Volts using Object Adapter: " + volt240.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int volt) {
        switch (volt) {
            case 3 :
                return socketAdapter.get3Volts();
            case 12 :
                return socketAdapter.get12Volts();
            case 240 :
                return socketAdapter.get240Volts();
            default :
                return socketAdapter.get240Volts();
        }
    }
}
