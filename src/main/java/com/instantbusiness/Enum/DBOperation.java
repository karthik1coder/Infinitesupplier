package com.instantbusiness.Enum;

public enum operation {
    
    DELETE("DELETE"),
    UPDATE("UPDATE"),
    INSERT("INSERT");

    private final String operation;

    private operation(String operation) {
        this.operation = operation;
    }
}
