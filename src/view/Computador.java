package view;

public class Computador {
    public static final double PRECIO_BASE = 1500000;
    public static final double PRECIO_MOUSE = 60000;
    public static final double PRECIO_HEADPHONE = 110000;

    private double precio_base;
private double precio_mouse;
private double precio_headphone;

public Computador(Computador computador) {
    super();
    precio_base = PRECIO_BASE;
    precio_mouse = PRECIO_MOUSE;
    precio_headphone = PRECIO_HEADPHONE;
}

public Computador(double precio_base,double precio_headphone) {
    super();
    precio_mouse = PRECIO_MOUSE;
}

public Computador(double precio_base,double precio_headphone,double precio_mouse) {
    super();
    
}

public double calcularPrecio() {
    var preciopc = precio_base + precio_headphone + precio_mouse; 
    return preciopc;
    
}


}
