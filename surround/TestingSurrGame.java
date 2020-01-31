package surround;
import static org.junit.Assert.*;
import org.junit.jupiter.api.DynamicTest;
import org.junit.Test;
public class TestingSurrGame {




    public class testingSurrGame {

        @Test
        public void testCornersUL() {
            surround.Surround4Game g = new surround.Surround4Game();
            g.select(0, 1);
            g.nextPlayer();
            g.select(0,0);
            g.nextPlayer();
            g.select(1, 0);
            assertTrue(g.getWinner() == 0);
        }

        @Test
        public void testCornersUR() {
            surround.Surround4Game g = new surround.Surround4Game();
            g.select(0, 2);
            g.nextPlayer();
            g.select(0,3);
            g.nextPlayer();
            g.select(1, 3);
            assertTrue(g.getWinner() == 0);
        }

    }}