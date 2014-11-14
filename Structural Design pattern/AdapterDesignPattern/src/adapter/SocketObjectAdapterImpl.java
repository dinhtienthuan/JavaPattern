package adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get240Volts() {
        return socket.getVolts();
    }

    @Override
    public Volt get12Volts() {
        Volt volt = socket.getVolts();
        return convertVolt(volt, 20);
    }

    @Override
    public Volt get3Volts() {
        Volt volt = socket.getVolts();
        return convertVolt(volt, 80);
    }

    private Volt convertVolt(Volt volt, int rate) {
        return new Volt(volt.getVolts() / rate);
    }
}
