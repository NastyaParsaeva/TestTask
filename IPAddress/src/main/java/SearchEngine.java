import java.util.ArrayList;

public class SearchEngine {

    ArrayList<Ip> ipAddresses;

    public SearchEngine() {
        ipAddresses = new ArrayList<Ip>();
    }

    public ArrayList<Ip> findAvailableIp(Ip ip1, Ip ip2) {

        //если аргументы расположены не в порядке возрастания, меняем их местами
        if (ip2.getNumberIp() < ip1.getNumberIp()) {
            Ip ip = ip1;
            ip1 = ip2;
            ip2 = ip;
        }

        //находим разницу между численным представлением ip-адресов
        int diff = (int)(ip2.getNumberIp() - ip1.getNumberIp());
        long next = ip1.getNumberIp();

        //в цикле находим численное представление всех ip-адресов, находящихся в указанном диапазоне.
        //Каждый найденный таким образом ip-адрес, добавляем в ArrayList
        for (int i = 1; i<diff; i++) {
            next++;
            Ip nextIp = new Ip(next);
            ipAddresses.add(nextIp);
        }
        return ipAddresses;
    }
}