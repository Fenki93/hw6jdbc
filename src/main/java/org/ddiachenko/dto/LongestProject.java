package org.ddiachenko.dto;

public class LongestProject {

    private String name;
    private String  project_duration;

    public LongestProject(String name, String  project_duration) {
        this.name = name;
        this.project_duration = project_duration;
    }

    @Override
    public String toString() {
        return "LongestProject{" +
                "name='" + name + '\'' +
                ", project_duration=" + project_duration +
                '}';
    }
}
