package proyectos.reto5.modelo.vo;

public class Requerimiento_2 {
    private int ID_Compra;
    private int ID_MaterialConstruccion;
    private int Precio_Unidad;
    private String Nombre_Material;

    public String getNombre_Material() {
        return Nombre_Material;
    }
    public void setNombre_Material(String nombre_Material) {
        Nombre_Material = nombre_Material;
    }
    public int getID_Compra() {
        return ID_Compra;
    }
    public void setID_Compra(int iD_Compra) {
        ID_Compra = iD_Compra;
    }
    public int getID_MaterialConstruccion() {
        return ID_MaterialConstruccion;
    }
    public void setID_MaterialConstruccion(int iD_MaterialConstruccion) {
        ID_MaterialConstruccion = iD_MaterialConstruccion;
    }
    public int getPrecio_Unidad() {
        return Precio_Unidad;
    }
    public void setPrecio_Unidad(int precio_Unidad) {
        Precio_Unidad = precio_Unidad;
    }
}
