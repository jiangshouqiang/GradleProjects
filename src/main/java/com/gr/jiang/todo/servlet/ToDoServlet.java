package com.gr.jiang.todo.servlet;

import com.gr.jiang.todo.repository.InMemoryToDoRepository;
import com.gr.jiang.todo.repository.ToDoRepository;
import com.gr.jiang.todo.model.ToDoItem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by jiang on 16/9/5.
 */
public class ToDoServlet extends HttpServlet {
    private ToDoRepository toDoRepository = new InMemoryToDoRepository();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        String servletPath = req.getServletPath();
        String view = processRequest(servletPath,req);
        System.out.println(servletPath+":"+view);
        RequestDispatcher dispatcher = req.getRequestDispatcher(view);
        dispatcher.forward(req,resp);
    }
    private String processRequest(String servletPath,HttpServletRequest request){
        if(servletPath.equals("/all")){
            List<ToDoItem> toDoItems = toDoRepository.findAll();
            System.out.println(toDoItems);
            request.setAttribute("toDoItems",toDoItems);
            return "/jsp/index.jsp";
        }else if(servletPath.equals("/delete")){

        }
        return "/all";
    }
}