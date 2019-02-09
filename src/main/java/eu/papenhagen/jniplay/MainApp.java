package eu.papenhagen.jniplay;

/**
 * use basic JNI
 * with own code (c++) and header File
 * to generate the header File use the maven profile
 * this is only to out soruce code in c++ (maybe for speed)
 *
 * @author jens.papenhagen
 */
public class MainApp {

    public static void main(String[] args) {
        System.loadLibrary("eu_papenhagen_jniplay_MainApp");
        output();
    }

    public static native void output();

}
