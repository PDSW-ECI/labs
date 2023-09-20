package com.example.servingwebcontent;

import java.util.ArrayList;

public class User {
    private Integer id;
    private String title;
    private Boolean completed;

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String  getTitle(){
        return title;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    public boolean getCompleted(){
        return completed;
    }
}
