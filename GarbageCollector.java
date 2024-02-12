public class GarbageCollector {
    public static void main(String args[]){
        Runtime r = Runtime.getRuntime();
        long mem;
        System.out.println("Total memory is "+r.totalMemory());
        mem = r.freeMemory();
        System.out.println("Initial free memory is "+mem);
        r.gc();
        mem = r.freeMemory();
        System.out.println("Free memory after garbage collection is "+mem);
    }
}
