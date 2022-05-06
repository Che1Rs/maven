import static org.junit.Assert.assertEquals;

public class UserJUnitTest {
    public static void testExample () {
        int a = 10;
        assertEquals(10, a);
        System.out.println("This is the test library, I import JUnit as the external library.");

    }

    public static void main(String[] args) {
        testExample();
    }
}
