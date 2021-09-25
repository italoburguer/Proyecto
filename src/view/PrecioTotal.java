package view;

public class PrecioTotal {
   private int totalPCs;
   private int totalLaptops;
   private int totalDesktops;
   private Computador listaComputadores[];
   private ComputadorPortatil portatil;
   private ComputadorMesa pMesa;

      public PrecioTotal() {
       super();

       this.totalPCs = 0;
       this.totalLaptops = 0;
       this.totalDesktops = 0;
       


   }

  

public PrecioTotal(Computador listaComputadores[]) {
       super();
       this.listaComputadores = listaComputadores;
       
   }




   public void mostrarTotales(){
       portatil = new ComputadorPortatil();
       
       pMesa = new ComputadorMesa();
        for (Computador computador : listaComputadores) {
            
       if (computador instanceof ComputadorPortatil) {
          ComputadorPortatil calculo = (ComputadorPortatil)computador; 
           totalLaptops += portatil.calcularPre(calculo);
       } else {
        ComputadorMesa mesa = (ComputadorMesa)computador;
           totalDesktops += pMesa.calcularPrem(mesa);
       }

       totalPCs = totalDesktops + totalLaptops;
    
}

System.out.println("El precio total de los computadores es de " + totalPCs);
System.out.println("La suma del precio de los Laptops es de " + totalLaptops);
System.out.println("La suma del precio de los Desktops es de " + totalDesktops);
    
   }





  
    
}
