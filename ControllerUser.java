package jdbc_PR;

import java.util.ArrayList;
import java.util.List;

public class ControllerUser {

    private VistaUser  vista = new VistaUser();

    public ControllerUser(){}

    //Guardar un usuario
    public void registrar(User user){
        UserDao dao = new UserDaoImpl();
        dao.registrar(user);
    }

    //Actualizar
    public void actualizar(User user){
        UserDao dao = new UserDaoImpl();
        dao.actualizar(user);
    }

    //listar users
    public void  verUsers(){
        List<User> users = new ArrayList<User>();
        UserDao dao = new UserDaoImpl();
        users = dao.obtener();
        vista.verUsuarios(users);
    }
    //listar users por id
    public void verUsersById(int id){
        UserDao dao = new UserDaoImpl();
        User user;
        user = dao.getUserById(id);
        vista.verUser(user);
    }

    //eliminar
    public void eliminar(int id){
        UserDao dao = new UserDaoImpl();
        dao.eliminar(id);
    }


}
