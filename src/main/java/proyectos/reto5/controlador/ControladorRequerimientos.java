package proyectos.reto5.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import proyectos.reto5.modelo.dao.Requerimiento_1Dao;
import proyectos.reto5.modelo.dao.Requerimiento_2Dao;
import proyectos.reto5.modelo.dao.Requerimiento_3Dao;
import proyectos.reto5.modelo.vo.Requerimiento_1;
import proyectos.reto5.modelo.vo.Requerimiento_2;
import proyectos.reto5.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    Requerimiento_1Dao dao = new Requerimiento_1Dao();
    Requerimiento_2Dao dao2 = new Requerimiento_2Dao();
    Requerimiento_3Dao dao3 = new Requerimiento_3Dao();
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        return dao.comprasPagadas();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return dao2.requerimiento2();
    }
    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return dao3.requerimiento3();
    }
}
