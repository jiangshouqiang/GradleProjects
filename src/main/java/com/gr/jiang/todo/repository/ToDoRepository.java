package com.gr.jiang.todo.repository;

import com.gr.jiang.todo.model.ToDoItem;

import java.util.List;

/**
 * Created by jiang on 16/9/5.
 */
public interface ToDoRepository {
    List<ToDoItem> findAll();
    ToDoItem findById(Long id);
    Long insert(ToDoItem toDoItem);
    void update(ToDoItem toDoItem);
    void delete(ToDoItem toDoItem);
}