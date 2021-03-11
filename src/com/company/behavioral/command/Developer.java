package com.company.behavioral.command;

public class Developer {
    Command insertCommand;
    Command updateCommand;
    Command selectCommand;
    Command deleteCommand;

    public Developer(Command insertCommand, Command updateCommand, Command selectCommand, Command deleteCommand) {
        this.insertCommand = insertCommand;
        this.updateCommand = updateCommand;
        this.selectCommand = selectCommand;
        this.deleteCommand = deleteCommand;
    }

    public void insert(){
        insertCommand.execute();
    }

    public void update(){
        updateCommand.execute();
    }

    public void select(){
        selectCommand.execute();
    }

    public void delete(){
        deleteCommand.execute();
    }
}
