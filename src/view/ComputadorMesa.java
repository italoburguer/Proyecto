package view;

public class ComputadorMesa extends Computador {
    public  int CAMERA = 80000;
public   int KEYBOARD = 160000;

private int camera;
private int keyboard;

public ComputadorMesa() {
    super(null);
    camera = CAMERA;
    keyboard = KEYBOARD;
}

public ComputadorMesa(int camera) {
    super(null);
    this.camera = camera;
    keyboard = KEYBOARD;
}


public ComputadorMesa(int camera, int keyboard) {
    super(null);
    this.camera = camera;
    this.keyboard = keyboard;
}

public double calcularPrem(ComputadorMesa mesa){

    var preciopc = super.calcularPrecio() + mesa.camera + mesa.keyboard;
    return preciopc;
}
    
}
