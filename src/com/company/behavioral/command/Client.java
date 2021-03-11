package com.company.behavioral.command;

public class Client {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );


        developer.select();
        developer.update();
        developer.insert();
        developer.delete();


    }

}
