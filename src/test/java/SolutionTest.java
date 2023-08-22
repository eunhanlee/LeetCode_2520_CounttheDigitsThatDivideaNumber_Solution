import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testCountDigits() {
        Solution solution = new Solution();

        int expected1 = 2;
        int actual1 = solution.countDigits(12);
        assertEquals(expected1, actual1);

        int expected2 = 3;
        int actual2 = solution.countDigits(111);
        assertEquals(expected2, actual2);

        int expected3 = 2;
        int actual3 = solution.countDigits(123);
        assertEquals(expected3, actual3);

        int expected4 = 1;
        int actual4 = solution.countDigits(7);
        assertEquals(expected4, actual4);

        int expected5 = 3;
        int actual5 = solution.countDigits(444);
        assertEquals(expected5, actual5);

        int expected6 = 1;
        int actual6 = solution.countDigits(7);
        assertEquals(expected6, actual6);

        int expected7 = 1;
        int actual7 = solution.countDigits(178);
        assertEquals(expected7, actual7);

        int expected8 = 2;
        int actual8 = solution.countDigits(252);
        assertEquals(expected8, actual8);

        int expected9 = 2;
        int actual9 = solution.countDigits(36);
        assertEquals(expected9, actual9);

        int expected10 = 3;
        int actual10 = solution.countDigits(987654321);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
