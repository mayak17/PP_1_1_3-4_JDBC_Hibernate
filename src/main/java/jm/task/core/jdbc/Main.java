package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Nikita", "Kalnov", (byte) 32);
        service.saveUser("Dima", "Vasilyev", (byte) 24);
        service.saveUser("Vladimir", "Kuznetcov", (byte) 41);
        service.saveUser("Evgeniy", "Drozdov", (byte) 18);
        for(User user : service.getAllUsers()) {
            System.out.println(user.toString());
        }
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}
