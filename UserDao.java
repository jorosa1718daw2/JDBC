package jdbc_PR;
import java.util.List;

public interface UserDao {
     boolean registrar(User user);
     List<User> obtener();
     User getUserById(int id);
     boolean actualizar(User user);
     boolean eliminar(int id);
}








