package proyectos.reto5.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import proyectos.reto5.modelo.vo.Requerimiento_2;
import proyectos.reto5.util.JDBCUtilities;

public class Requerimiento_2Dao {
    Connection conexion;
    public Requerimiento_2Dao() {
        try {
            this.conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> lista = new ArrayList<Requerimiento_2>();
        String Sql="SELECT ID_Compra, mc.ID_MaterialConstruccion, mc.Nombre_Material, mc.Precio_Unidad "+
        "FROM  Compra c join MaterialConstruccion mc on c.ID_MaterialConstruccion =mc.ID_MaterialConstruccion"+
        " WHERE mc.Precio_Unidad GROUP BY ID_Compra HAVING (mc.Precio_Unidad) <1100";
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(Sql);
        while (rs.next()) {
            Requerimiento_2 ComprasUnidad= new Requerimiento_2();
            ComprasUnidad.setID_Compra(rs.getInt(1));
            ComprasUnidad.setID_MaterialConstruccion(rs.getInt(2));
            ComprasUnidad.setNombre_Material(rs.getString(3));
            ComprasUnidad.setPrecio_Unidad(rs.getInt(4));
            lista.add(ComprasUnidad);
        }
        return lista;
    }
}
