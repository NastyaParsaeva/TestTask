package service;

import java.util.ArrayList;

public interface Service {
    void getPhoneList(String FIO);
    void addNew(String FIO, String... phones);
    void showAll();
}
