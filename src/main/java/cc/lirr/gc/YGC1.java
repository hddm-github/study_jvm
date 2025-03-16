package cc.lirr.gc;


public class YGC1 {
    /*
       -Xmx128M -XX:+UseG1GC -XX:+PrintGCTimeStamps -XX:+PrintGCDetails -
        XX:+UnlockExperimentalVMOptions -XX:G1LogLevel=finest

        128m
        5% 60%
        6.4M  75M
     */
    private static final int size = 1024 * 256;
    public static void main(String[] args) {
        byte[] data = new byte[1024 * 256];
        for (int i = 0; i < 100; i++) {
            data = new byte[1024 * 256];
        }
    }
}