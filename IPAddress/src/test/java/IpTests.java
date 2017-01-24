import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IpTests {

    // объявляем поле типа тестируемого класса
    private Ip testingIp;

    @Test
    public void testConvertorStringToNumber() throws Exception {
        long expected = 3_166_416_907L;
        testingIp = new Ip("188.187.176.11");
        long actual = testingIp.getNumberIp();
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertorNumberToString() throws Exception {
        String expected = "188.187.176.11";
        testingIp = new Ip(3_166_416_907L);
        String actual = testingIp.getStringIp();
        assertEquals(expected, actual);
    }
}
