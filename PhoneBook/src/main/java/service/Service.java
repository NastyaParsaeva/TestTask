package service;

import java.util.ArrayList;

public interface Service {
    void showPhoneList(String FIO);
    void addNew(String FIO, String... phones);
}
