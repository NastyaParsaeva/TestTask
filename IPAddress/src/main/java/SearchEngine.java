import java.util.ArrayList;

public class SearchEngine {

    ArrayList<Ip> ipAddresses;

    public SearchEngine() {
        ipAddresses = new ArrayList<Ip>();
    }

    public ArrayList<Ip> FindAvailable(Ip ip1, Ip ip2) {

        if (ip2.getNumberIp() < ip1.getNumberIp()) {
            Ip ip = ip1;
            ip1 = ip2;
            ip2 = ip;
        }
        int diff = (int)(ip2.getNumberIp() - ip1.getNumberIp());
        long next = ip1.getNumberIp();
        for (int i = 1; i<diff; i++) {
            next++;
            Ip nextIp = new Ip(next);
            ipAddresses.add(nextIp);

        }
        return ipAddresses;
    }
}