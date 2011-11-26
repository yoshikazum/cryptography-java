import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CryptographyTest {

    protected Cryptography solution;

    @Before
    public void setUp() {
        solution = new Cryptography();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        int[] numbers = new int[]{1, 2, 3};

        long expected = 12L;
        long actual = solution.encrypt(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        int[] numbers = new int[]{1, 3, 2, 1, 1, 3};

        long expected = 36L;
        long actual = solution.encrypt(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        int[] numbers = new int[]{1000, 999, 998, 997, 996, 995};

        long expected = 986074810223904000L;
        long actual = solution.encrypt(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        int[] numbers = new int[]{1, 1, 1, 1};

        long expected = 2L;
        long actual = solution.encrypt(numbers);

        Assert.assertEquals(expected, actual);
    }

}
