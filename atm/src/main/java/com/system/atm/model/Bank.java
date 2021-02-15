package com.system.atm.model;

import com.system.atm.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("bank")
public class Bank {
    private int id;
    private String bankName;

    @Autowired
    private List<User> users = new ArrayList();

    public void addAccount(User user){
        users.add(user);
    }
    public void deleteAccount(User user){
        users.remove(user);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return bankName;
    }

    public void setName(String name) {
        this.bankName = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
