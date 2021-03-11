package com.cg.apps.schoolmswithoutjpa.studentms.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateStudentRequest {
    @Size( max=10)
    @NotBlank
    private String name;
    @Min(0) @Max(100)
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
