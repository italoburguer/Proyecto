package view;


public class Req3 {
    private int ID_Proyecto;
    private String pagado;
    private String clasificacion;

    public Req3(int ID_Proyecto, String pagado, String clasificacion) {
        this.ID_Proyecto = ID_Proyecto;
        this.pagado = pagado;
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Req3 [clasificacion=" + clasificacion + ", idProyecto=" + ID_Proyecto + ", pagado=" + pagado + "]";
    }
}