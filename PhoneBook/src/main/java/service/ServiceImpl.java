package service;

import dao.Dao;

import java.util.ArrayList;

public class ServiceImpl implements Service {

    private Dao dao;

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    public void showPhoneList(String FIO) {
        //При вызове данного метода вызывается аналогичный у экземпляра Dao
        ArrayList<String> phoneList = dao.getPhoneList(FIO);
        //Если полученный список номеров пустой, выводится сообщение об отстутствии указанного пользователя
        //В противном случае выводится список номеров, принадлежащих пользователю
        if (phoneList == null) {
            System.out.println("Пользователь не найден");
        } else {
            for (int i = 0; i < phoneList.size(); i++) {
                System.out.println((i + 1) + ". " + phoneList.get(i));
            }
        }
    }

    public void addNew(String FIO, String... phones) {
        //При вызове данного метода вызывается аналогичный у экземпляра Dao
        dao.addNew(FIO, phones);
    }
}
