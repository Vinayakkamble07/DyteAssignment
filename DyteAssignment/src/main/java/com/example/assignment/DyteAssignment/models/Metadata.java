package com.example.assignment.DyteAssignment.models;

public class Metadata {

    private String parentResourceId;

    // Constructors, getters, and setters

    public String getParentResourceId() {
        return parentResourceId;
    }

    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    // Constructors, if needed

    @Override
    public String toString() {
        return "Metadata{" +
                "parentResourceId='" + parentResourceId + '\'' +
                '}';
    }
}

