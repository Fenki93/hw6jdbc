package org.ddiachenko.dto;

public class MaxWorkerSalary {

    private String name;
    private int salary;

    public MaxWorkerSalary(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
