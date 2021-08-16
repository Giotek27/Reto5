package proyectos.reto5.modelo.vo;

public class Requerimiento_3 {
    private int ID_Compra;
    private String Pagado;
    private int ID_Proyecto;
    private int Fecha;


    public int getID_Compra() {
        return ID_Compra;
    }
    public void setID_Compra(int iD_Compra) {
        ID_Compra = iD_Compra;
    }
    public String getPagado() {
        return Pagado;
    }
    public void setPagado(String pagado) {
        Pagado = pagado;
    }
    public int getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

    public int getFecha() {
        return Fecha;
    }
    public void setFecha(int fecha) {
        Fecha = fecha;
    }
}
