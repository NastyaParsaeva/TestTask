package dao;


import java.util.ArrayList;


public interface Dao {
    ArrayList<String> getPhoneList(String FIO);
    void addNew(String FIO, String[] phones);
}
