package view;



public class Proyecto {

  private double pMonto;
 private double pInteres;
 private int pTiempo;


 
public double calcularInteresCompuesto(int pTiempo,double pMonto,double pInteres){
    var compuesto = pMonto * (Math.pow((1+pInteres),pTiempo)-1);
    return compuesto;

}

public double calcularInteresSimple(int pTiempo,double pMonto,double pInteres){
    var simple = pMonto*pInteres*pTiempo;
     return simple;
    
}

public String compararProyectos(int pTiempo,double pMonto,double pInteres){
    var respuesta = calcularInteresCompuesto(pTiempo,pMonto,pInteres ) - calcularInteresSimple(pTiempo,pMonto,pInteres );
    return "Resultado " + respuesta;
    
    

}


    }