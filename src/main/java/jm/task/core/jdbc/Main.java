package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Mark","Kolikhov",(byte)17);
        userService.saveUser("David","Simonyan",(byte)17);
        userService.saveUser("Georgiy","Klima",(byte)16);
        userService.saveUser("Daria","Eleferenko",(byte)18);
        List<User> userList = userService.getAllUsers();
        for (User user : userList) {
            System.out.println(user);
        }
        //userService.removeUserById(1);
        // userService.cleanUsersTable();
        // userService.dropUsersTable();
    }
}