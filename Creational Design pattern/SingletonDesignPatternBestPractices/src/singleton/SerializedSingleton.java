package singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = 4264325206660432851L;

    public SerializedSingleton() {}

    private static class SingletonHelper {

        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    
    
    protected Object readResolve() {
        return getInstance();
    }
}
