package edu.wctc;

import java.io.Serializable;

public enum Priority implements Serializable {

    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High");

    private String value;

    Priority(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
