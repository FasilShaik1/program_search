package com.example.programsearch;

public class Program {
    private String name;
    private String code;

    // Constructor
    public Program(String name, String code) {
        this.name = name;
        this.code = code.replace("\\r\\n", "\n"); // Replace \\r\\n with \n
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code.replace("\\r\\n", "\n"); // Replace \\r\\n with \n
    }
}