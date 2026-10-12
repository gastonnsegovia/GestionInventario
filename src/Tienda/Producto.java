package Tienda;

import java.util.Scanner;

public class Producto {
    Scanner teclado = new Scanner(System.in);

    //atributos de la clase
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    //metodos de la clase
    public void venderUnidades (int cantidad){
        if (cantidad > stock){
            System.out.println("ERROR: stock insuficiente para vender" + cantidad + " unidades de: " + this.nombre);
        }
        if (cantidad <= 0){
            System.out.println("ERROR: la cantidad ingresada es incorrecta");
        }
        else {
            stock -= cantidad;
            System.out.println("venta realizada: " + cantidad + " unidades de: " + this.nombre + ". " + "Stock restante: " + stock);
        }
    }
    public void reponerStock (int cantidad){
        if (cantidad <= 0){
            System.out.println("ERROR: no se puede cargar esa cantidad al stock, intente con otra");
        }
        else {
            stock += cantidad;
            System.out.println("Reposición registrada: + "+ cantidad + " unidades. Stock actual: " + stock);
        }
    }
    public void actualizarPrecio (double precio){
        if (precio < 0){
            System.out.println("el precio del producto no puede ser negativo");
        }
        else {
            double anteriorPrecio = this.precio;
            this.precio = precio;
            System.out.println("Precio actualizado de "  + this.nombre + ": $" + anteriorPrecio + " -> $" + this.precio);

        }
    }
    public void mostrarFicha (){
        System.out.println("=== Ficha de producto ===");
        System.out.println("Codigo:    " + codigo);
        System.out.println("Nombre:    " + nombre);
        System.out.println("Precio:    $" + precio);
        System.out.println("Stock:    " + stock);
    }
}
