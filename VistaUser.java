package jdbc_PR;

import java.util.List;

public class VistaUser {
    public void verUser(User user){
        System.out.println("Datos del Usuario: " +user );
    }

    public void verUsuarios(List<User> users){
        for(User user: users){
            System.out.println("Datos del Usuario: " +user);
        }
    }
}
