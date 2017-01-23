package service;

import dao.Dao;

import java.util.ArrayList;

public class ServiceImpl implements Service {

    private Dao dao;

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    public void getPhoneList(String FIO) {
        ArrayList<String> phoneList = dao.getPhoneList(FIO);
        if (phoneList == null) {
            System.out.println("Пользователь не найден");
        } else {
            for (int i=0; i<phoneList.size(); i++) {
                System.out.println((i+1) + ". " + phoneList.get(i));
            }
        }
    }

    public void addNew(String FIO, String... phones) {
        dao.addNew(FIO, phones);
    }

    public void showAll() {
        dao.showAll();
    }

}
