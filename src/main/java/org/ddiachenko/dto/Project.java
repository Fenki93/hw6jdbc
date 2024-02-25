package org.ddiachenko.dto;

public class Project {

    private String name;
    private int price;

    public Project(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
