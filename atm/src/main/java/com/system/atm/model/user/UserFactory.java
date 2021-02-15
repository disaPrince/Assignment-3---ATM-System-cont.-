package com.system.atm.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("userFactory")
public class UserFactory {

    public static User createUser(UserType userType, int id, String name, int age,
                                  String username, String password, int balance){

        User u = null;

        switch (userType){
            case Single:
                u = new Single(id, name, age, username, password, balance);
                break;
            case Retiree:
                u = new Retiree(id, name, age, username, password, balance);
                break;
            case Children:
                u = new Children(id, name, age, username, password, balance);
                break;
        }
        return u;
    }
}
