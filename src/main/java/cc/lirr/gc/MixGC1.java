package cc.lirr.gc;


import java.util.ArrayList;

public class MixGC1 {
    /*
       -Xmx128M -XX:+UseG1GC -XX:+PrintGCTimeStamps -XX:+PrintGCDetails -

        128m
        5% 60%
        6.4M  75M
     */
    private static final int size = 1024 * 256;
    private static ArrayList list =  new ArrayList();
    public static void main(String[] args) {
        byte[] data = new byte[1024 * 256];
        for (int i = 0; i < 500; i++) {
            data = new byte[1024 * 256];
            byte[] data2 = new byte[1024 * 256];
            list.add(data2);
        }
    }
    /*
    0.181: [GC pause (G1 Evacuation Pause) (young), 0.0038769 secs]
0.187: [GC pause (G1 Evacuation Pause) (young) (initial-mark), 0.0020493 secs]
0.207: [GC pause (G1 Evacuation Pause) (mixed) (to-space exhausted), 0.0023932 secs]
0.268: [Full GC (Allocation Failure)  98235K->97978K(128M), 0.0030216 secs]


     */
}