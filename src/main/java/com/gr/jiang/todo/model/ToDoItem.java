package com.gr.jiang.todo.model;

/**
 * Created by jiang on 16/9/5.
 */
public class ToDoItem implements Comparable<ToDoItem>{
    private Long id;
    private String name;
    @Override
    public int compareTo(ToDoItem o) {
        return 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}