package cc.lirr.gc;


public class HE {
    /*
       -Xmx128M -XX:+UseG1GC -XX:+PrintGCTimeStamps -XX:+PrintGCDetails
      -XX:G1HeapRegionSize=4M      手动指定region大小
        128m
        5% 60%
        6.4M  75M
     */
    private static final int size = 1024 * 4096;
    public static void main(String[] args) {
        byte[] data = new byte[1022 * 4096];
        for (int i = 0; i < 50; i++) {
            data = new byte[1022 * 4096];
        }
    }
}