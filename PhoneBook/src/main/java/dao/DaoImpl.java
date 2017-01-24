package dao;

import model.PhoneBook;

import java.util.ArrayList;


public class DaoImpl implements Dao {

    PhoneBook phoneBook;

    public DaoImpl(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public ArrayList<String> getPhoneList(String FIO) {
        //При вызове данного метода вызывается аналогичный у экземпляра класса phoneBook
        return phoneBook.getPhoneList(FIO);
    }

    public void addNew(String FIO, String[] phones) {
        //При вызове данного метода вызывается аналогичный у экземпляра класса phoneBook
        phoneBook.addNew(FIO, phones);
    }
}