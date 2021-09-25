package view;

public class ComputadorPortatil extends Computador {
public final static int EXTRA_BATERY = 100000;
public final static int EXTRA_CHARGER = 80000;

private int extra_batery;
private int extra_charger;


public ComputadorPortatil(int extra_batery) {
    super(null);
    
    this.extra_batery = extra_batery;

    this.extra_charger = EXTRA_CHARGER;
    
    

}



public ComputadorPortatil() {
    super(null);
    extra_batery = EXTRA_BATERY;
    extra_charger = EXTRA_CHARGER;
    
}



public ComputadorPortatil(int extra_batery,int extra_charger) {
    super(null);
    this.extra_batery = extra_batery;
    this.extra_charger = extra_charger;
    return;
}






public double calcularPre(ComputadorPortatil calculo){
    
    
    var preciopor = super.calcularPrecio()+calculo.extra_batery+calculo.extra_charger;
    return preciopor;
    
}
    
    
}
