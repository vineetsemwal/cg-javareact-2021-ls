package com.cg.apps.schoolmswithoutjpa.studentms.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ChangeNameRequest {
    private int id;

    @Size( max=10)
    @NotBlank
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
