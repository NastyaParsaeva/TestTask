import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два IP адреса: ");

        Ip ip1 = new Ip(scanner.nextLine());
        Ip ip2 = new Ip(scanner.nextLine());

        //создаем экземпляр класса SearchEngine
        SearchEngine searchEngine = new SearchEngine();

        //получаем список всех доступных ip-адресов
        ArrayList<Ip> available = searchEngine.FindAvailable(ip1, ip2);

        //Выводим на экран строковое представление всех доступных ip-адресов
        for (Ip x: available) {
            System.out.println(x.getStringIp());
        }
    }
}
