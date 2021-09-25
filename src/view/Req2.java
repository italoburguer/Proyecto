package view;

import java.sql.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Req2 {
    private int estrato;
    private String fecha_Inicio;
    private int financiable;
    private Double Porcentaje_Cuota_Inicial;

    public Req2(int estrato, String fecha_Inicio, int financiable, double Porcentaje_Cuota_Inicial) {
        super();
        this.fecha_Inicio = fecha_Inicio;
        this.financiable = financiable;
        this.estrato = estrato;
        this.Porcentaje_Cuota_Inicial = Porcentaje_Cuota_Inicial;

    }

    @Override
    public String toString() {
        return "Req2 [estrato=" + estrato + ", fechaInicio=" + fecha_Inicio + ", financiable=" + financiable
                + ", porcentaje=" + Porcentaje_Cuota_Inicial *100 + "]";
    }
}