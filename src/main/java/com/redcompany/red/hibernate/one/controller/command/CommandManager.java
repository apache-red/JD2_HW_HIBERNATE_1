package com.redcompany.red.hibernate.one.controller.command;

import com.redcompany.red.hibernate.one.controller.command.impl.*;
import com.redcompany.red.hibernate.one.controller.command.util.CommandName;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {

    private static final CommandManager instance = new CommandManager();
    private Map<CommandName, BasicCommand> commands = new HashMap<>();


    public CommandManager() {
        commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
        commands.put(CommandName.ALL_USERS_COMMAND_JDBC, new UsersInformationJDBCCommand());
        commands.put(CommandName.ALL_USERS_COMMAND_HIBERNATE, new UserInformationHibernateCommand());
        commands.put(CommandName.GENERATE_USERS_COMMAND, new GenerateUsersCommand());
    }



    public static CommandManager getInstance() {
        return instance;
    }

    public BasicCommand getCommand(String commandName) {
        CommandName name = CommandName.valueOf(commandName.toUpperCase());
        BasicCommand command;
        if (name != null) {
            command = commands.get(name);
        } else {
            command = commands.get(CommandName.NO_SUCH_COMMAND);
        }
        return command;
    }



}
