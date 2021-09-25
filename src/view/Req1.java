package view;

public class Req1 {
    private int total;
    private int ID_Proyecto;
    private String pagado;
    private String proveedor;

    public Req1(int total, int ID_Proyecto, String pagado, String proveedor) {
        super();
     this.total = total;
     this.ID_Proyecto = ID_Proyecto;
     this.pagado = pagado;
     this.proveedor = proveedor;
    }

    @Override
public String toString() {
    return "Req1 [idProyecto=" + ID_Proyecto + ", pagado=" + pagado + ", proveedor=" + proveedor + ", total=" + total
            + "]";
}

}