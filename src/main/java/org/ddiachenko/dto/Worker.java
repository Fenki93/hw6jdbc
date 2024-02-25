package org.ddiachenko.dto;

import java.sql.Date;

public class Worker {

    private String name;
    private String type;
    private Date date;

    public Worker(String name, String type, Date date) {
        this.name = name;
        this.type = type;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
