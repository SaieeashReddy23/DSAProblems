
import LinkedList.*;

public class Main {
    public static void main(String[] args) {

        LRUCacheUsingQueueAndHashMap cache = new LRUCacheUsingQueueAndHashMap(2);

        cache.set(4,4);
        cache.set(3,3);
        cache.set(2,2);
        cache.set(1,1);
        cache.print();
        int val = cache.get(1);
        cache.print();
        System.out.println(val);
        val = cache.get(2);
        cache.print();
        System.out.println(val);
//        val = cache.get(3);
//        cache.print();
//        System.out.println(val);
//        val = cache.get(4);
//        cache.print();
//        System.out.println(val);

    }


}