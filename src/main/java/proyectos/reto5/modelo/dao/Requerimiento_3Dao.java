package proyectos.reto5.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import proyectos.reto5.modelo.vo.Requerimiento_3;
import proyectos.reto5.util.JDBCUtilities;

public class Requerimiento_3Dao {
    Connection conexion;
    public Requerimiento_3Dao() {
        try {
            this.conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> ListaCompraAnual = new ArrayList<Requerimiento_3>();
        String sql="SELECT ID_Proyecto,Pagado,Fecha, STRFTIME ('%Y',Fecha)"+
        " FROM Compra WHERE Pagado='Parcialmente' and STRFTIME ('%m',Fecha)='02'";
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Requerimiento_3 ID_CompraAnual = new Requerimiento_3();
            ID_CompraAnual.setID_Compra(rs.getInt(1));
            ID_CompraAnual.setPagado(rs.getString(2));
            ID_CompraAnual.setFecha(rs.getInt(3));
            ListaCompraAnual.add(ID_CompraAnual);
    }
    return ListaCompraAnual;
}
}
