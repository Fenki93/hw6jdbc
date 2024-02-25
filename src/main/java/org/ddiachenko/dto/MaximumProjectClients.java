package org.ddiachenko.dto;

public class MaximumProjectClients {
    private String clientName;
    private int projectCount;

    public MaximumProjectClients(String clientName, int projectCount) {
        this.clientName = clientName;
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {
        return "MaximumProjectClients{" +
                "clientName='" + clientName + '\'' +
                ", projectCount=" + projectCount +
                '}';
    }
}
