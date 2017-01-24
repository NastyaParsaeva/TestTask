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

        //При добавлении новой записи в телефонную книгу, создаем ArrayList, в который по одному
        // добавляются номера телефонов из массива
        ArrayList<String> phoneList = new ArrayList<String>();
        for (String phone: phones) {
            phoneList.add(phone);
        }
        //Имя пользователя, а также список его телефонов добавляются в HashMap
        personPhoneList.put(person, phoneList);
    }

    public ArrayList<String> getPhoneList(String FIO) {

        // Создаем итератор, благодаря которому получаем возможность перебрать последовательно весь hashmap.
        // Сравниваем ключи каждой пары в hashmap с FIO, полученным в качетсве аргумента
        //При совпадении возвращаем список номеров
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
