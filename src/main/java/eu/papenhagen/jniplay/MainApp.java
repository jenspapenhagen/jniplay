package eu.papenhagen.jniplay;

/**
 * playing with JNI
 *
 * @author jens.papenhagen
 */
public class MainApp {

    public static void main(String[] args) {
        output();
    }

    public static native void output();

}
