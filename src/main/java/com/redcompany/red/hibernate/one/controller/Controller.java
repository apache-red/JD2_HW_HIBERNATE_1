package com.redcompany.red.hibernate.one.controller;

import com.redcompany.red.hibernate.one.controller.command.BasicCommand;
import com.redcompany.red.hibernate.one.controller.command.CommandManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.redcompany.red.hibernate.one.controller.util.RequestParameterName.*;

public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = null;
        String commandName = req.getParameter(COMMAND_NAME);
        BasicCommand command = CommandManager.getInstance().getCommand(commandName);


    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
