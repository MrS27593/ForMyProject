package KlasowoObiektowo.SlowaKluczowe.NativeDone;

public class Main {
    public static void main(String[] args) {

    }
}

class Example{
    public native void doSmothenig();
    public native int calculate(int a, int b);
}

class SystemInfo{
    public native String getOSName();

    static {
        System.loadLibrary("SystremLib");
    }
}