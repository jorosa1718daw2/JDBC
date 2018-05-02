/*package jdbc_PR;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;


public class EstudiantDaoImpl implements  EstudiantDao{


    @Override
    public boolean registrar(Estudiant estudiant) {
        Connection connect = null;
        PreparedStatement ps = null;

        try {
            connect = Conexion.getConnection();
            ps = connect.prepareStatement("INSERT INTO estudiant VALUES (?, NULL, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP )");
            ps.setString(1, estudiant.getName());
            int i = ps.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Estudiant> obtener() {
        Connection con = Conexion.getConnection();
        List<Estudiant> listaEstudiant= new ArrayList<Estudiant>();
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiant ORDER BY codiEstudiant");


            while(rs.next()){
                Estudiant e = new Estudiant();

                e.setName(rs.getString(1));
                e.setId(rs.getInt(2));
                e.setdataAlta(rs.getTimestamp(3));
                e.setDataBaixa(rs.getTimestamp(4));
                listaEstudiant.add(e);

            }
        }catch (SQLException ex){
            System.out.println("Error: Clase EstudianDaoImpl, método Obtener");
            ex.printStackTrace();
        }
        return listaEstudiant;
    }

    @Override
    public Estudiant getUserById(int id) {
        return null;
    }

    @Override
    public boolean actualizar(Estudiant estudiant) {
        Connection con= null;
        PreparedStatement ps= null;
        boolean actualizar= false;

        String sql="UPDATE estudiant SET nom='"+estudiant.getName()+"' WHERE codiEstudiant="+estudiant.getId();
        try {
            con= Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate(sql);
            actualizar=true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EstudianDao, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminar(int id) {
        Connection con= null;
        Statement stm= null;

        boolean eliminar=false;

        String sql="DELETE FROM estudiant WHERE codiEstudiant="+id;
        try {
            con=Conexion.getConnection();
            stm=con.createStatement();
            stm.execute(sql);
            eliminar=true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EstudiantDaoImpl, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
}*/
