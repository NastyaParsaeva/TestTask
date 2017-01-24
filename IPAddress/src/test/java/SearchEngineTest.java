import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchEngineTest {

    public final static ArrayList<Ip> TEST_DATA = getTestIpList();
    public final static Ip FIRST_IP = new Ip("192.168.0.1");
    public final static Ip SECOND_IP = new Ip("192.168.0.5");

    private static ArrayList<Ip> getTestIpList() {

        ArrayList<Ip> IpList = new ArrayList<Ip>();
        IpList.add(new Ip("192.168.0.2", 3_232_235_522L));
        IpList.add(new Ip("192.168.0.3", 3_232_235_523L));
        IpList.add(new Ip("192.168.0.4", 3_232_235_524L));

        return IpList;
    }

        // объявляем поле типа тестируемого класса
        private SearchEngine testingSearchEngine;


    @Before
    public void setUp() throws Exception {
        testingSearchEngine = new SearchEngine();
    }


    @Test
    public void TestFindAvailableIp() throws Exception {

        List<Ip> expected = TEST_DATA;

        List<Ip> actual = testingSearchEngine.findAvailableIp(FIRST_IP, SECOND_IP);

        for (int i=0; i<actual.size(); i++) {
            assertEquals(expected.get(i).getNumberIp(), actual.get(i).getNumberIp());
            assertEquals(expected.get(i).getStringIp(), actual.get(i).getStringIp());
        }
    }
}
