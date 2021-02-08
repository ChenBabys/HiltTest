package com.yatinova.hilttest;

import javax.inject.Inject;

public class User {
    public String id;
    public String name;
    public String from;
    @Inject
    public User(){
        this("1","秦始皇", "咸阳");
    }

    public User(String id, String name, String from) {
        this.id = id;
        this.name = name;
        this.from = from;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}