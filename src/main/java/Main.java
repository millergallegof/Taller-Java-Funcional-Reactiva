import katas.*;

import java.util.Optional;

import static org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Kata1.execute());
        assertEquals(Kata1.execute().size(), 4);
        System.out.println("Kata 1 solved!");

        assertEquals(Kata2.execute().size(), 2);
//        Kata2.execute();

        assertEquals(Kata3.execute().size(), 4);
        System.out.println("Kata 3 solved!");
//        Kata3.execute();

        assertEquals(Kata4.execute().size(), 4);
        System.out.println("Kata 4 solved!");
//        Kata4.execute();

        assertEquals(Kata5.execute(), 5.0, 0.0);
        System.out.println("Kata 5 solved!");
//        Kata5.execute();

        assertEquals(Kata6.execute(), "http://cdn-0.nflximg.com/images/2891/Fracture300.jpg");
        System.out.println("Kata 6 solved!");
//        Kata6.execute();

        assertEquals(Kata7.execute().size(), 4);
        System.out.println("Kata 7 solved!");
//        Kata7.execute();

        assertEquals(Kata8.execute().size(), 3);
        System.out.println("Kata 8 solved!");
//        Kata8.execute();

        assertEquals(Kata9.execute().size(), 4);
        System.out.println("Kata 9 solved!");
//        Kata9.execute();

        assertEquals(Kata10.execute().size(), 2);
        System.out.println("Kata 10 solved!");
//        Kata10.execute();

        assertEquals(Kata11.execute().size(), 2);
        System.out.println("Kata 11 solved!");
//        Kata11.execute();

        System.out.println("ALL DONE, you're a functional programming NINJA!");
    }
}
