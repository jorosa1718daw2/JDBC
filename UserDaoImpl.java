package jdbc_PR;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean registrar(User user){
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql= "INSERT INTO user values ('"+user.getName()+"','"+user.getEmail()+"','"+user.getPass()+"', NULL)";

        try{
            con = Conexion.getConnection();
            stm = con.createStatement();
            stm.executeUpdate(sql);
            registrar = true;
            stm.close();
            con.close();
        }catch (SQLException e){
            System.out.println("Error: Clase USerDao, metodo registrar");
            e.printStackTrace();

        }
        return registrar;
    }

    @Override
    public List<User> obtener() {
        Connection co =null;
        Statement stm= null;
        ResultSet rs=null;

        String sql="SELECT * FROM user ORDER BY ID";

        List<User> listaUser= new ArrayList<User>();

        try {
            co= Conexion.getConnection();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                User c = new User();

                c.setName(rs.getString(1));
                c.setEmail(rs.getString(2));
                c.setPass(rs.getString(3));
                c.setId(rs.getInt(4));
                listaUser.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase UserDaoImple, método obtener");
            e.printStackTrace();
        }

        return listaUser;
    }

    @Override
    public boolean actualizar(User user) {
        Connection connect= null;
        PreparedStatement stm= null;

        boolean actualizar= false;

        String sql="UPDATE user SET username='"+user.getName()+"', email='"+user.getEmail()+"' WHERE id="+user.getId();
        try {
            connect= Conexion.getConnection();
            stm=connect.prepareStatement(sql);
            stm.executeUpdate(sql);
            actualizar=true;
        } catch (SQLException e) {
            System.out.println("Error: Clase UserDao, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminar(int id) {
        Connection connect= null;
        Statement stm= null;

        boolean eliminar=false;

        String sql="DELETE FROM user WHERE id="+id;
        try {
            connect=Conexion.getConnection();
            stm=connect.createStatement();
            stm.execute(sql);
            eliminar=true;
        } catch (SQLException e) {
            System.out.println("Error: Clase UserDaoImpl, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
    ////////////////////////////////////////////////
    @Override
    public User getUserById(int id){
        Connection connect = Conexion.getConnection();
        try{
            Statement stm = connect.createStatement();
            ResultSet rs = stm.executeQuery("SELECT username, email, id FROM user WHERE id="+id);

            if(rs.next()){
                User c = new User();

                c.setName(rs.getString(1));
                c.setEmail(rs.getString(2));
                c.setId(rs.getInt(3));
                return c;

            }
        }catch (SQLException e){
            System.out.println("Error: Clase USerDaoImpl, método getUserById");
            e.printStackTrace();
        }
        return null;

    }
}
