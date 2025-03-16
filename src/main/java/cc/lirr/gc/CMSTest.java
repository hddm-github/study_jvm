package cc.lirr.gc;

public class CMSTest {
    /**
     * -Xms20m -Xmx20m -Xmn10m -XX:SurvivorRatio=8 -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseConcMarkSweepGC
     * @param args
     */
    private static final int size = 1024 * 4096;

    public static void main(String[] args) {
        System.out.println("step 1 ...");
        byte[] date = new byte[size];
        System.out.println("step 2 ...");

        byte[] date2 = new byte[size];
        System.out.println("step 3 ...");

        byte[] date3 = new byte[size / 2  ];
        System.out.println("step 4 ...");

        byte[] date4 = new byte[size];
        System.out.println("step 5 ...");



    }
}
