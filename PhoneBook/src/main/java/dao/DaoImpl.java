package dao;

import model.PhoneBook;

import java.util.ArrayList;


public class DaoImpl implements Dao {

    PhoneBook phoneBook;

    public DaoImpl(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public ArrayList<String> getPhoneList(String FIO) {
        return phoneBook.getPhoneList(FIO);
    }

    public void addNew(String FIO, String[] phones) {
        phoneBook.addNew(FIO, phones);
    }

    public void showAll() {
        phoneBook.showAll();
    }
}