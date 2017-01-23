import dao.Dao;
import dao.DaoImpl;
import model.PhoneBook;
import service.Service;
import service.ServiceImpl;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        Dao dao = new DaoImpl(phoneBook);
        Service service = new ServiceImpl(dao);

        Scanner scanner = new Scanner(System.in);
        String FIO;

        service.addNew("Иванов И. И.", "+8 800 2000 500", "+8 800 200 600");
        service.addNew("Петров П.П.", "+8 800 2000 700");
        service.addNew("Сидоров С.С.", "+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000");

        System.out.println("Введите имя пользователя: ");
        FIO = scanner.nextLine();
        service.getPhoneList(FIO);
    }
}
