package adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get240Volts() {
        return getVolts();
    }

    @Override
    public Volt get12Volts() {
        Volt volt = getVolts();
        return convertVolt(volt, 20);
    }

    @Override
    public Volt get3Volts() {
        Volt volt = getVolts();
        return convertVolt(volt, 80);
    }

    private Volt convertVolt(Volt volt, int rate) {
        return new Volt(volt.getVolts() / rate);
    }
}
