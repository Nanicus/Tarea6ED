/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Nani
 */
public class Tarea6EDClase {

    /**
     * @param args the command line arguments
     */
    private static final double Descuento_5_porciento = 0.95;
    private static final double Descuento_80_porciento = 0.8;
    private static final int Descuento_Cantidad = 5;
  
        public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > 3)
            precioProducto -= Descuento_Cantidad;
        calcularTotal(numProductos, precioProducto);
    }

    private void calcularTotal(int numProductos, double precioProducto) {
        double total;
        if (numProductos != 0) {
            total = precioProducto * Descuento_80_porciento;
            System.out.println("El total a pagar es:" + total);
            System.out.println("Enviado");
        } else {
            total = precioProducto * Descuento_5_porciento;
            System.out.println("El total a pagar es:" + total);
            System.out.println("Enviado");
        }
    }
    
    }
    

