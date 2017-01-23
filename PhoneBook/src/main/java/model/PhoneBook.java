package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBook {

    HashMap<String, ArrayList<String>> personPhoneList;

    public PhoneBook() {
        this.personPhoneList = new HashMap<String, ArrayList<String>>();
    }

    public void addNew(String person, String[] phones) {
        ArrayList<String> phoneList = new ArrayList<String>();
        for (String phone: phones) {
            phoneList.add(phone);
        }
        personPhoneList.put(person, phoneList);
    }

    public void showAll() {
        Iterator itetaror = personPhoneList.entrySet().iterator();
        while (itetaror.hasNext()) {
            Map.Entry pair = (Map.Entry) itetaror.next();

            System.out.println(pair.getKey() + " " + pair.getValue()) ;
        }
    }

    public ArrayList<String> getPhoneList(String FIO) {
        Iterator iterator = personPhoneList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if (pair.getKey().equals(FIO)) {
                return (ArrayList<String>)pair.getValue();
            }
        }
        return null;
    }
}
