package cc.lirr.gc;


public class SerialGC {
    /*
      -Xmx20M
      -Xmn10M
      -XX:+PrintGCDetails
     -XX:+UseSerialGC
     -XX:+PrintGCTimeStamps
      -XX:SurvivorRatio=8
     */

    private static final int size = 1024 * 256;
    public static void main(String[] args) {
//        System.gc();
        for (int i = 0; i < 30; i++) {
            byte[] date = new byte[size];
        }
    }
    /**
     * Allocation Failure:  // 分配内存失败
     * metadata space exhausted:  // 元数据空间耗尽
     * system.gc() invoked:  // 调用了System.gc() => full gc
     */
    /**
     * 各种垃圾回收器常见的类型：
     * serial => DefNew
     * parNew => ParNew
     * Parallel => PSYoungGen
     * Parallel Old => ParoldGen
     */


}
